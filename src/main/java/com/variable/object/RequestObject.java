package com.variable.object;

/**
 * 20150729[Star] created.
 */
public class RequestObject {
    /**
     * 往前去5分鐘的資料
     */
    public static final long SYNC_THRESHOLD_TIME = 0;
    public static final long THRESHOLD_TIME = 10000;
    //function name
    public static final String GetADID="GetADID";
    public static final String GetImage="GetImage";
    public static final String GetRegisterUserProfileByADID="GetRegisterUserProfileByADID";
    public final static String HasRegister = "HasRegister";
    public final static String RegisterDevice = "RegisterDevice";
    public final static String VerifyValidationCode = "VerifyValidationCode";
    public final static String UpdatePushToken = "UpdatePushToken";
    public final static String SyncCat = "SyncCat";
    public final static String SyncProcate = "SyncProcate";
    public final static String SyncCircle = "SyncCircle";
    public final static String SyncChannel = "SyncChannel";
    public final static String SyncEvent = "SyncEvent";
    public final static String SyncReply = "SyncReply";
    public final static String SyncUser = "SyncUser";
    public final static String SyncForm = "SyncForm";
    public final static String CreateEvent = "CreateEvent";
    public final static String CreateReply = "CreateReply";
    public final static String SendReplyEvent = "SendReplyEvent";
    public final static String CreateForm = "CreateForm";
    public final static String GetForm = "GetForm";
    public final static String CreateVote = "CreateVote";
    public final static String ConfirmInviteCode = "ConfirmInviteCode";
    public final static String RegisterDeviceByInviteCode = "RegisterDeviceByInviteCode";
    public final static String RegisterDeviceByEmail = "RegisterDeviceByEmail";
    public final static String UpdateUserProfile = "UpdateUserProfile";
    public final static String CreateImage = "CreateImage";
    public final static String ActivateEventPlusService = "ActivateEventPlusService";
    public final static String InvitePeople = "InvitePeople";
    public final static String Encode = "Encode";
    public final static String QRCodeInviteCircle = "QRCodeInviteCircle";
    public final static String Decode = "Decode";
    public final static String CreateException = "CreateException";
    public final static String GetException = "GetException";
    public final static String AssignEvent = "AssignEvent";
    public final static String UpdateForm = "UpdateForm";
    public final static String DeleteForm = "DeleteForm";
    public final static String SelectForm = "SelectForm";
    public final static String GetChannelUser = "GetChannelUser";

    //request tag
    public final static String FunctionName = "FunctionName";
    public final static String ReturnCode = "ReturnCode";
    public final static String Data = "Data";
    public static final String NewInstall = "NewInstall";
    public static final String MacAddress = "MacAddress";
    public static final String Email = "Email";
    public static final String DeviceName = "DeviceName";
    public static final String OsType = "OsType";
    public static final String ADID = "ADID";
    public static final String EventId = "EventId";
    public static final String ContentType = "ContentTyp";
    public static final String EventType = "EventType";
    public static final String ValidationCode = "ValidationCode";
    public static final String PushToken= "PushToken";
    public static final String userName = "userName";
    public static final String TimeStamp = "TimeStamp";
    public static final String UserNo = "UserNo";
    public static final String UserId = "UserId";
    public static final String AppNo = "AppNo";
    public static final String ReleaseType = "ReleaseType";
    public static final String SystemCode = "SystemCode";
    public static final String FixedAppendInfo = "FixedAppendInfo";
    public static final String EventNo = "EventNo";
    public static final String EventLimitCount = "EventLimitCount";
    public static final String ChId = "ChId";
    public static final String EventRootLimitCount = "EventRootLimitCount";
    public static final String FileID = "FileID";
    public static final String FileName = "FileName";
    public static final String SecondFileName = "SecondFileName";
    public static final String HexStringData = "HexStringData";
    public static final String SubCateNo = "SubCateNo";
    public static final String EventContent = "EventContent";
    public static final String RootEventNo = "RootEventNo";
    public static final String ReplyEventContent = "ReplyEventContent";
    public static final String channel_id = "channel_id";
    public static final String circle_id = "circle_id";
    public static final String form_id = "form_id";
    public static final String ChannelId = "ChannelId";
    public static final String event_content_type = "event_content_type";
    public static final String correlationID = "correlationID";
    public static final String event_id = "event_id";
    public static final String reply_content = "reply_content";
    public static final String post_content_type = "post_content_type";
    public static final String thumbSize = "thumbSize";
    public static final String thumbWidth = "thumbWidth";
    public static final String thumbHeight = "thumbHeight";
    public static final String imageSize = "imageSize";
    public static final String imageWidth = "imageWidth";
    public static final String imageHeight = "imageHeight";
    public final static String formData = "formData";
    public final static String appendPartWithFileData = "appendPartWithFileData";
    public final static String name = "name";
    public final static String fileName = "fileName";
    public final static String mimeType = "mimeType";
    public final static String Seq = "Seq";
    public final static String FormName = "FormName";
    public final static String FormDescription = "FormDescription";
    public final static String UserName = "UserName";
    public final static String Date = "Date";
    public final static String Timestamp = "Timestamp";
    public final static String SubFormName = "SubFormName";
    public final static String SubFormDescription = "SubFormDescription";
    public final static String type = "type";
    public final static String Type = "Type";
    public final static String Hint = "Hint";
    public final static String content = "content";
    public final static String Content = "Content";
    public final static String FormType = "FormType";
    public final static String CommitStatus = "CommitStatus";
    public final static String UDID = "UDID";
    public final static String InviteCode = "InviteCode";
    public final static String UniqueId="UniqueId";
    public final static String LocalName = "LocalName";
    public final static String Note = "Note";
    public final static String Permission = "Permission";
    public final static String SubData = "SubData";
    public final static String Status = "Status";
    public final static String ImageContent = "ImageContent";
    public final static String event_content = "event_content";
    public final static String form_content = "form_content";
    public final static String image_id = "image_id";
    public final static String IsFinish = "IsFinish";
    public final static String create_time = "create_time";
    public final static String assign_type = "assign_type";
    public final static String assign_id = "assign_id";
    public final static String update_form_content = "update_form_content";
    public final static String user_id = "user_id";
    public final static String select_id = "select_id";
    public final static String select_type = "select_type";
    public final static String timestamp = "timestamp";
    public final static String timestamp_min = "timestamp_min";
    public final static String timestamp_max = "timestamp_max";
    public final static String Version = "Version";
    public final static String isReinstall = "isReinstall";
    public final static String hasLoadOldDb = "hasLoadOldDb";
}