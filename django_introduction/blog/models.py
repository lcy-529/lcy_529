from django.db import models


# Create your models here.
class Article(models.Model):
    # 文章的唯一 ID
    article_id = models.AutoField(primary_key=True)
    # 文章标题
    title = models.TextField()
    # 文章摘要
    brief_content = models.TextField()
    # 文章的主要内容
    content = models.TextField()
    # 文章的发布日期
    # auto_now=True 表示如果在发布文章时没有指定发布日期的话，默认的以当前时间作为发布日期
    publish_date = models.DateTimeField(auto_now=True)

    def __str__(self):
        return self.title
