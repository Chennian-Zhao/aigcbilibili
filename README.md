# 仿B站微服务项目

实现了以下功能：
- 视频的上传、查看、点赞、评论、收藏、弹幕
- 用户的个人信息查看编辑、个人主页权限修改、关注
- 多种方式登录、一对一私聊
- 文生文、文生图智能PPT
- 关注UP动态评论点赞私聊消息的推送
- 视频和用户的聚合搜索

## 项目内容

在这个项目里，您可以了解到：

### 数据库操作
- **MyBatis-Plus** 的单表增删改查、插入更新自动填充值
- **MyBatis-Plus-Join** 的业务层实现多表联查

### 文件管理
- **MinIO** 的创建删除桶、上传删除获取文件

### 异步任务
- **CompletableFuture** 的异步执行任务、异步并行等待、结果回调

### 工具库
- **Hutool** 的检测文件类型、字节数组、文件流和Base64编码互相转换

### 视频处理
- **JAVE** 的转换视频编码、截取视频某帧图片

### JSON处理
- **FastJson**、**Gson** 和 **Jackson** 的序列化和反序列化
- JSON化响应返回前端前自定义修改响应内容

### 异常处理
- 全局异常处理和泛型统一响应体

### 日志管理
- 配置文件添加配置集中各级别日志到一个文件夹下、添加过滤器实现自定义内容进日志里

### 文件传输
- 封装文件入 `Resource` 类与实现 `MultipartFile` 接口达到不同服务间文件流的传输

### 配置管理
- 解决版本冲突的 **Nacos** 使用

### 路由管理
- **Gateway** 的路由、重写路径、解决与MVC冲突

### 认证与授权
- **Security + JWT** 的统一鉴权与授权
- 双JWT的无感刷新Token
- 自定义请求头和HTTP-Only-Cookie的防CSRF、XSS攻击

### 多种登录方式
- 图形码、手机号、邮箱的多种登录方式

### 缓存与消息队列
- **Redis** 的缓存验证码、缓存频繁查询视频
- **RocketMQ** 的异步发送消息、多种模式的消费消息

### 搜索引擎
- **Elasticsearch** 索引文档的创建删除和更新、文档的条件查询、分页查询与滚动查询

### 数据同步
- **XXL-Job** + Redis + RocketMQ + Elasticsearch + 布隆过滤器的自定义ES与MySQL数据同步

### 缓存实现
- 简易的仿Redis缓存读取与数据过期剔除实现

### 实时通信
- **WebSocket** 的SpringBoot版单对单连接建立关闭和接收消息

### 链路追踪
- **Sleuth + Zipkin** 的请求链路追踪

### 文档与监控
- **Swagger**、**Druid** 的使用

### 智能生成
- **讯飞星火** 的文生文调用
- **讯飞星火** 的文生图、给主题生成PPT所有文案（全网首发）

---

## 项目地址

项目地址：[https://labilibili.com](https://labilibili.com)，演示地址https://labilibili.com/video/%E6%BC%94%E7%A4%BA.mp4，欢迎访问项目，给GitHub点个小星星就更好了

---