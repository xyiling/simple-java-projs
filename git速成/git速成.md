这里开一个小号，帮助小白快速学习一些git基本操作
## 1. 创建仓库
**step 1**
![创建仓库](img/%E5%88%9B%E5%BB%BA%E4%BB%93%E5%BA%93.png)
**step 2**
![初始化仓库信息](img/%E5%88%9D%E5%A7%8B%E5%8C%96%E4%BB%93%E5%BA%93.png)
**step 3**
![创建仓库](img/%E5%88%9B%E5%BB%BA%E4%BB%93%E5%BA%93.jpg)
## 2. 配置ssh key
### 2.1 本地生存密钥
在命令行输入如下ssh命令，然后一直回车，结果如下就代表ok
```shell
ssh-keygen -t rsa -C "780222719@qq.com" 
# 这里的邮箱用你创建GitHub账号时用到的邮箱
```
![生成密钥](img/%E7%94%9F%E6%88%90%E5%AF%86%E9%92%A5.png)
### 2.2 将公钥上传到github
![设置公钥第一步](img/%E8%AE%BE%E7%BD%AE%E5%85%AC%E9%92%A5%E7%AC%AC%E4%B8%80%E6%AD%A5.png)
![设置公钥第二步](img/%E8%AE%BE%E7%BD%AE%E5%85%AC%E9%92%A5%E7%AC%AC%E4%BA%8C%E6%AD%A5.png)
![新建ssh key](img/%E6%96%B0%E5%BB%BAssh%20key.png)
最终来到了这个页面
![添加密钥的最终页面](img/%E6%B7%BB%E5%8A%A0%E5%AF%86%E9%92%A5%E6%9C%80%E7%BB%88%E9%A1%B5%E9%9D%A2.png)
添加ssh key之前，需要前往终端，复制生成好的ssh key
在终端输入如下的命令：
```shell
cat ~/.ssh/id_rsa.pub
```
得到如下的结果，复制得到的公钥，填写到页面的ssh key：
![公钥](img/%E5%85%AC%E9%92%A5.png)
![最后一步](img/%E6%9C%80%E5%90%8E%E4%B8%80%E6%AD%A5.png)
### 2.3 测试连通性
在终端输入如下命令：
```shell
ssh -T git@github.com
```
出现下面的结果就是成功了
![成功添加公钥到GitHub](img/%E6%88%90%E5%8A%9F.png)
## 3. push到自己的仓库
### 3.1 克隆到本地
回到项目地址，然后复制ssh链接，
![克隆仓库](img/%E5%85%8B%E9%9A%86%E4%BB%93%E5%BA%93.png)
使用如下的命令，将刚刚创建的仓库克隆到本地目录
```shell
git clone git@github.com:xyldxh/pyprojs.git
```
### 3.2 添加自己的代码并push到仓库
![添加代码](img/%E6%B7%BB%E5%8A%A0%E4%BB%A3%E7%A0%81.png)
### 3.3 使用git命令完成push前的操作
输入下面的命令：
```shell
# 需要配置一下，后面就不需要了，但如果你换设备，就需要重新从上传公钥那里开始配置了
git config --global user.name "xyldxh"
git config --global user.email "780222719@qq.com"
cd pyprojs
# ./*表示当前文件的全部内容，当然你也可以只添加部分内容
# 比如 git add ./hello.py
git add ./*
# 字符串内填写本次做了什么事
git commit -m "添加了hello.py"
git push
```
![本地配置git](img/%E6%9C%AC%E5%9C%B0%E9%85%8D%E7%BD%AEgit.png)
![push到仓库](img/push%E5%88%B0%E4%BB%93%E5%BA%93.png)
经过这些步骤后，可以回到自己的仓库，看看有什么变化
![查看结果](img/查看结果.png)
## 4. push到别人的仓库
我会fork我另一个账号的git仓库来演示这些操作
### 4.1 fork别人的仓库
来到别人的仓库，单击fork
![fork别人的仓库第一步](img/fork%E5%88%AB%E4%BA%BA%E7%9A%84%E4%BB%93%E5%BA%93%E7%AC%AC%E4%B8%80%E6%AD%A5.png)
![直接create fork](img/createfork.png)
### 4.2 克隆到本地
```shell
git clone git@github.com:xyldxh/simple-java-projs.git
```
### 4.3 添加自己的代码
![新的代码文件](img/%E6%96%B0%E4%BB%A3%E7%A0%81%E6%96%87%E4%BB%B6.png)
### 4.4 push到自己的仓库
重复之前push操作（不需要重复git config）
```shell
git add ./greet
git commit -m "你好，很高兴能加入你的项目"
git push
```
![push成功](img/push%E6%88%90%E5%8A%9F.png)
### 4.5 申请pull request
![查看push结果](img/%E6%9F%A5%E7%9C%8Bpush%E7%BB%93%E6%9E%9C.png)
![合并申请](img/%E5%8F%91%E5%87%BA%E5%90%88%E5%B9%B6%E7%94%B3%E8%AF%B7.png)
![合并第二步](img/%E5%90%88%E5%B9%B6%E7%AC%AC%E4%BA%8C%E6%AD%A5.png)
![合并操作最后一步](img/%E5%90%88%E5%B9%B6%E6%9C%80%E5%90%8E%E4%B8%80%E6%AD%A5.png)
注意：这张图片中的“hi”是你需要填写的内容，主要是说明你发现了什么问题希望合并，或者有什么新的功能等
![等待合并结果](img/%E7%AD%89%E5%BE%85%E5%90%88%E5%B9%B6%E7%BB%93%E6%9E%9C.png)
## 5. git速成教程结束