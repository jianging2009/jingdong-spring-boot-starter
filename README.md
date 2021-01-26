# jingdong-spring-boot-starter
京东api

支持京东联盟商品、订单、cps等api

使用：

（1）对于springboot项目，只需要导入包并新增yaml/properties配置
```
#client id 必需京东联盟APP_KEY
duoduoke.api.client-id="your client id"
#client secret 必需京东联盟APP_SECRET
duoduoke.api.client-secret="you client secret"
#client超时时间 非必需
duoduoke.api.connection-timeout-millis=300
#request请求超时时间 非必需
duoduoke.api.connection-request-timeout=300
#自定义client 需要实现com.holyw.duoduoke.client.IClient接口
#可以支持不走配置 从数据库、redis、配置中心等读取以上配置实现 非必需
#duoduoke.api.client-class-name=com.holyw.client.MyDuoduokeClient
```
（2）注入jingdongGoodsTemplate就可以方便的使用
```java
@Autowired
private JingdongGoodsTemplate jingdongGoodsTemplate;
```
测试代码：
```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        JingdongGoodsTemplate jingdongGoodsTemplate = applicationContext.getBean(JingdongGoodsTemplate.class);
        Long[] skuIds = {4097215L};
        UnionOpenGoodsQueryRequest request = new UnionOpenGoodsQueryRequestBuilder().addGoodsIdList(skuIds).build();
        GoodsVO goodsDetail = jingdongGoodsTemplate.getGoodsDetail(request);
        System.out.println(goodsDetail);
    }
}
```
自定义Client实现：
```java
public class MyDuoduokeClient implements IClient {
    @Override
    public JdClient getDefaultClient() {
        return new DefaultJdClient("https://router.jd.com/api", "",
                getClientIdFromDB().replaceAll("\"", ""),
                getClientSecretFromDB().replaceAll("\"", ""),
               300,300);
    }

    private String getClientIdFromDB() {
        //redisTemplate.opsForValue().get("");
        //configMapper.getDuoduokeConfig("")
        return "xxxxxxxxxx";
    }
    private String getClientSecretFromDB() {
        //redisTemplate.opsForValue().get("");
        //configMapper.getDuoduokeConfig("")
        return "xxxxxxxxxx";
    }
}
```

交流QQ：675424581
