package com.zb.vueblog.common.lang;

import lombok.Data;
import java.io.Serializable;  //可序列化

/*
* 这个类是为了格式化后端返回给前端的数据格式的。
* */

@Data //自动生成get set方法
public class Result implements Serializable {
    private int code;  //200正常 非200异常
    private String msg;
    private Object data;

    //请求成功，返回的数据,
    /*这里利用重载做了两次封装，因为在成功的请求中，状态码一般都是200, 而成功情况的msg对于前端而言
    并没有实际意义，所以可以写死，这样，在调用这个Result生成统一返回结果的类时，就只需要提供data即可
    如果有特殊的成功状态码，也可以通过传入指定的参数调用对应的succ方法，因为重载方法的调用，是根据传入
    参数与形式参数的对比决定的。*/
    public static Result succ(Object data){
        return Result.succ(200,"操作成功", data);
    }

    public static Result succ(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    //同理，请求失败也有对应的方法,在失败时，msg就比data重要了，因为失败时，data一般都是空，而msg有失败的原因
    //同理，根据传入的参数 会调用不同方法，看着是不同，实际上到最后都是同一个方法在生成结果，只是在调用上更加灵活
    //可以根据需要传入对应的信息
    public static Result fail(String msg){
        return Result.fail(400,msg, null);
    }

    public static Result fail(String msg, Object data){
        return Result.fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
