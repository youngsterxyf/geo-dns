package cn.xiayf.code.gns.action;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;

public interface Action {

    RespBody handle(ChannelHandlerContext ctx, HttpRequest req) throws Exception;
}
