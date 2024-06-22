package ljl.bilibili.chat.constant;

import ljl.bilibili.chat.entity.BigModelToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Constant {
    public static final String WEBSOCKET_CONNECT_PATH = "/ljl/bilibili/chat";
    public static final String MESSAGE_TYPE = "type";
    public static final String MESSAGE_TYPE_BIGMODEL = "bigmodel";
    public static final String MESSAGE_TYPE_MESSAGE = "message";
    public static final String MESSAGE_TYPE_REMOVE_SESSION = "removeSession";
    public static final String MESSAGE_TYPE_INIT = "init";
    public static final String MESSAGE_CONTENT = "content";
    public static final String MESSAGE_TYPE_SESSIONID = "sessionId";
    public static final String USER_IDENTITY = "userId";
    public static final String MESSAGE_TYPE_BIGMODEL_QUESTION = "question";
    public static final String RECEIVER_IDENTITY = "receiverId";
    public static final String MESSAGE_STATUS = "status";
    public static final String hostUrl = "wss://spark-api.xf-yun.com/v3.5/chat";
    //我
//    public static final String appid = "9971d1b2";
    //宏姐
//    public static final String appid = "cff2d6a5";
    //我
//    public static final String apiSecret = "NDRiMGFiNmJhZDc5ZDg2ZGJhYzZmYzE4";
    //宏姐
//    public static final String apiSecret = "YzRhMzM2Njc3N2FjMWQ3NGM0NTk0MjQ4";
    //我
//    public static final String apiKey = "865b202bad69a0f7d88374cb4e5dc1ed";
    //宏姐
//    public static final String apiKey = "7e2aad25d1b5ae0152a64eb5efea555b";
    public static final String ASSISTANT_ROLE = "assistant";
    public static final String USER_ROLE = "user";
    public static final String MODEL_APP_ID = "app_id";
    public static final String SESSION_UID = "uid";
    public static final String MODEL_DOMAIN = "domain";
    public static final String MODEL_DOMAIN_VALUE = "generalv3.5";
    public static final String MODEL_TEMPERATURE = "temperature";
    public static final String MODEL_MAX_TOKENS = "max_tokens";
    public static final String MODEL_PARAMETER = "chat";
    public static final String MESSAGE_TEXT = "text";
    public static final String PAYLOAD_MESSAGE = "message";
    public static final String REQUEST_HEADER = "header";
    public static final String REQUEST_PARAMTER = "parameter";
    public static final String REQUEST_PAYLOAD = "payload";
    public static final Set<BigModelToken> textTokenSet = new HashSet<>();
    public static final Set<BigModelToken> imageTokenSet = new HashSet<>();
    public static final Set<BigModelToken> pptTokenSet = new HashSet<>();
    static {
        textTokenSet.add(new BigModelToken().setOwner("zhu").setAppId("c6293686").setApiKey("ab297cbd46c3096c54427805f2b3b124").setApiSecret("MDAwNGJhM2Q1ZDNiOTk2MTdhYTRhMjY1").setUsedStatus(false));
        textTokenSet.add(new BigModelToken().setOwner("mei").setAppId("cff2d6a5").setApiKey("7e2aad25d1b5ae0152a64eb5efea555b").setApiSecret("YzRhMzM2Njc3N2FjMWQ3NGM0NTk0MjQ4").setUsedStatus(false));
        imageTokenSet.add(new BigModelToken().setOwner("zhu").setAppId("c6293686").setApiKey("ab297cbd46c3096c54427805f2b3b124").setApiSecret("MDAwNGJhM2Q1ZDNiOTk2MTdhYTRhMjY1").setUsedStatus(false));
        imageTokenSet.add(new BigModelToken().setOwner("mei").setAppId("cff2d6a5").setApiKey("7e2aad25d1b5ae0152a64eb5efea555b").setApiSecret("YzRhMzM2Njc3N2FjMWQ3NGM0NTk0MjQ4").setUsedStatus(false));
        pptTokenSet.add(new BigModelToken().setOwner("zhu").setAppId("c6293686").setApiKey("ab297cbd46c3096c54427805f2b3b124").setApiSecret("MDAwNGJhM2Q1ZDNiOTk2MTdhYTRhMjY1").setUsedStatus(false));
        pptTokenSet.add(new BigModelToken().setOwner("mei").setAppId("cff2d6a5").setApiKey("7e2aad25d1b5ae0152a64eb5efea555b").setApiSecret("YzRhMzM2Njc3N2FjMWQ3NGM0NTk0MjQ4").setUsedStatus(false));
    }

}
