from django.urls import path, include

import blog.views


# 这是一个数组，如果访问地址 url 里面含有 hello_world，就转化到blog.views.hello_world这个视图函数里，此处的函数方法不用加括号
urlpatterns = [
    path('hello_world', blog.views.hello_world),

    # 配置文章的路由
    path('content', blog.views.article_content),

    # 配置博客首页路由
    path('index', blog.views.get_index_page),

    # 配置文章详情页路由
    # path('detail', blog.views.get_detail_page)

    path('detail/<int:article_id>', blog.views.get_detail_page)
]