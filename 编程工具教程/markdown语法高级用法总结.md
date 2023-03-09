# markdown语法高级用法总结

## 跳转和超链接

### [页内跳转目标](#页内链接)

```markdown
[页内跳转目标](#页内链接)
页内链接可以是文字、超链接等，这里的“页内链接”放在文档末尾，以显示效果
```

### [页外跳转目标](页外链接)

```markdown
[页外跳转目标](页外链接)
页内链接可以是文字、超链接等，这里的“页外链接”会在文件不存在时自动创建目标文件

如果该链接是超链接，会跳转到相应网页
```

[页外跳转目标（超链接版），指向baidu.com](https://www.baidu.com)

### 超链接表现形式

#### 图片

![97194689_p0](E:\个人文件\97194689_p0.webp) 

```
![示例图片](图片路径)
```

#### 视频

##### 网络视频

<div style="position: relative; width: 100%; height: 0%; padding-bottom: 75%"><iframe src="//player.bilibili.com/player.html?aid=68833391&bvid=BV12J411M7Sj&cid=119292753&page=19" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true" height=600 width=800> </iframe></div>



```markdown
<div style="position: relative; width: 100%; height: 0%; padding-bottom: 75%"><iframe src="//player.bilibili.com/player.html?aid=68833391&bvid=BV12J411M7Sj&cid=119292753&page=19" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true" height=600 width=800> </iframe></div>
```



##### 本地视频

<!-- mp4格式 -->

<video src="C:\Users\17459\AppData\Roaming\Code\User\workspaceStorage\04c58040a506cd8c718822c4da59a620\redhat.java\jdt_ws\code_65d864e3\bin\html\videotag\movie.mp4" width=50% height=50%></video>

```markdown
<video src="C:\Users\17459\AppData\Roaming\Code\User\workspaceStorage\04c58040a506cd8c718822c4da59a620\redhat.java\jdt_ws\code_65d864e3\bin\html\videotag\movie.mp4"></video>
```



<!-- webm格式 -->

<video id="video" controls="" preload="none" poster="封面">
      <source id="webm" src="webm格式视频" type="video/webm">
</videos>

<!-- ovg格式 -->

<video id="video" controls="" preload="none" poster="封面">
      <source id="ogv" src="ogv格式视频" type="video/ogv">
</videos>

##### gif

![](https://media0.giphy.com/media/l41JWw65TcBGjPpRK/giphy.gif)

```mark
![](https://media0.giphy.com/media/l41JWw65TcBGjPpRK/giphy.gif)
```









## 附加信息

页内链接

[跳转和超链接](#跳转和超链接)

经实验，typora 1.3.8仅支持页内从后往前跳转，不支持从前往后跳转