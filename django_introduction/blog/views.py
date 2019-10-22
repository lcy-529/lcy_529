from django.shortcuts import render

from django.http import HttpResponse

from blog.models import Article

from django.core.paginator import Paginator
# Create your views here.


# 这个方法需要接收一个参数，这个参数就是 http 请求的对象
def hello_world(request):
    # 需要将返回的字符串封装成 HttpResponse 进行返回
    return HttpResponse("hello world")


# 创建文章视图
def article_content(request):
    article = Article.objects.all()[0]
    title = article.title
    brief_content = article.brief_content
    content = article.content
    article_id = article.article_id
    publish_date = article.publish_date
    # 定义返回参数
    return_str = 'title: %s, brief_content: %s, ' \
                 'content: %s, article_id: %s, publish_date: %s' % (title,
                                                                    brief_content,
                                                                    content,
                                                                    article_id,
                                                                    publish_date)
    return HttpResponse(return_str)


# 创建博客首页模板系统
def get_index_page(request):
    # 获取 page，当前是个字符串
    page = request.GET.get('page')
    if page:
        page = int(page)
    else:
        page = 1
    # print('page param: ', page)

    all_article = Article.objects.all()
    top8_article_list = Article.objects.order_by('-publish_date')[:8]

    paginator = Paginator(all_article, 4)
    page_num = paginator.num_pages
    print('page num: ', page_num)
    page_article_list = paginator.page(page)

    if page_article_list.has_next():
        next_page = page + 1
    else:
        next_page = page

    if page_article_list.has_previous():
        previous_page = page - 1
    else:
        previous_page = page

    # render 把模板系统和数据进行渲染然后返回
    return render(request, 'blog/index.html',
                  {
                      'article_list': page_article_list,
                      'page_num': range(1, page_num + 1),
                      'curr_page': page,
                      'next_page': next_page,
                      'previous_page': previous_page,
                      'top8_article_list': top8_article_list
                  })


# 创建文章详情页模板系统
def get_detail_page(request, article_id):
    all_article = Article.objects.all()
    curr_article = None
    previous_index = 0
    next_index = 0
    previous_article = None
    next_article = None
    for index, article in enumerate(all_article):
        if index == 0:
            previous_index = 0
            next_index = index + 1
        elif index == len(all_article) - 1:
            previous_index = index - 1
            next_index = index
        else:
            previous_index = index - 1
            next_index = index + 1

        if article.article_id == article_id:
            curr_article = article
            previous_article = all_article[previous_index]
            next_article = all_article[next_index]
            break

    section_list = curr_article.content.split('\n')
    return render(request, 'blog/detail.html',
                  {
                      'curr_article': curr_article,
                      'section_list': section_list,
                      'previous_article': previous_article,
                      'next_article': next_article
                  })

