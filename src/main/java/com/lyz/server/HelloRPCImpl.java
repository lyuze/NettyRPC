package com.lyz.server;

public class HelloRPCImpl implements HelloRPC {
    @Override
    public String hello(String name) {
        return "hello," + name;
    }
}