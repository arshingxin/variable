package com.variable.object;

/**
 * @author Star
 */
public class DBTableObject {
    /**
     * 0：初始或預設狀態
     * 1：發送中
     * 2：發送完成 - 已送出
     * 3：發送失敗
     * 4：發送完成 - 已同步
     * 5：已讀
     */
    public enum Status {
        NONE,
        SENDING,
        SEND_OK,
        SEND_NG,
        SYNCED,
        READ
    }

    public static int getStatus(Status status){
        if(status==Status.SENDING){
            return  Status.SENDING.ordinal();
        }else if(status==Status.SEND_OK){
            return  Status.SEND_OK.ordinal();
        }else if(status==Status.SEND_NG){
            return  Status.SEND_NG.ordinal();
        }else if(status==Status.SYNCED){
            return  Status.SYNCED.ordinal();
        }else if(status==Status.READ){
            return  Status.READ.ordinal();
        }else {
            return  Status.NONE.ordinal();
        }
    }

    /**
     * 0：初始或預設狀態
     * 1：自己
     * 2：邀請者
     * 3：受邀者
     * 4：刪除邀請
     * 5：朋友
     * 6：封鎖者
     * 7：被封鎖者
     * 8：摯友(我的最愛)
     * 9：刪除
     */
    public enum Relation {
        NONE,
        ME,
        INVITOR,
        INVITEE,
        HIDE_INVITE,
        FRIEND,
        BLOCKER,
        BLOCKEE,
        FAVORITE,
        DELETED
    }

    public static int getRelation(Relation relation){
        if(relation==Relation.ME){
            return Relation.ME.ordinal();
        }else if(relation==Relation.INVITOR){
            return Relation.INVITOR.ordinal();
        }else if(relation==Relation.INVITEE){
            return Relation.INVITEE.ordinal();
        }else if(relation==Relation.HIDE_INVITE){
            return Relation.HIDE_INVITE.ordinal();
        }else if(relation==Relation.FRIEND){
            return Relation.FRIEND.ordinal();
        }else if(relation==Relation.BLOCKER){
            return Relation.BLOCKER.ordinal();
        }else if(relation==Relation.BLOCKEE){
            return Relation.BLOCKEE.ordinal();
        }else if(relation==Relation.FAVORITE){
            return Relation.FAVORITE.ordinal();
        }else if(relation==Relation.DELETED){
            return Relation.DELETED.ordinal();
        }else{
            return Relation.NONE.ordinal();
        }
    }

    public enum CirclePermission {
        NONE,
        VIEW,
        ACCESS,
        PUBLISH,
        DELETE
    }

    public static int getCirclePermission(CirclePermission circlePermission){
        if(circlePermission==CirclePermission.VIEW){
            return CirclePermission.NONE.ordinal()+100;
        }else if(circlePermission==CirclePermission.ACCESS){
            return CirclePermission.NONE.ordinal()+200;
        }else if(circlePermission==CirclePermission.PUBLISH){
            return CirclePermission.NONE.ordinal()+300;
        }else if(circlePermission==CirclePermission.DELETE){
            return CirclePermission.NONE.ordinal()+400;
        }else{
            return CirclePermission.NONE.ordinal();
        }
    }

    public enum ChannelPermission {
        NONE,
        VIEW,
        ACCESS,
        PUBLISH,
        DELETE
    }

    public static int getChannelPermission(ChannelPermission channelPermission){
        if(channelPermission==ChannelPermission.VIEW){
            return ChannelPermission.NONE.ordinal()+100;
        }else if(channelPermission==ChannelPermission.ACCESS){
            return ChannelPermission.NONE.ordinal()+200;
        }else if(channelPermission==ChannelPermission.PUBLISH){
            return ChannelPermission.NONE.ordinal()+300;
        }else if(channelPermission==ChannelPermission.DELETE){
            return ChannelPermission.NONE.ordinal()+400;
        }else{
            return ChannelPermission.NONE.ordinal();
        }
    }
}
