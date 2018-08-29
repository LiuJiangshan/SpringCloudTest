###一、配置域名
```bash
vim /etc/hosts
```
添加
```hosts
127.0.0.1 peer1
127.0.0.1 peer2
```
###二、编译打包
```bash
cd cloud
./package.sh
```
###三、运行实例peer1、peer2
```bash
cd cloud
./peer1.sh
./peer2.sh
```
###四、访问实例
####[peer1](http://localhost:8081)
####[peer2](http://localhost:8082)