package _02_structural_patterns._12_proxy._03_java;

import _02_structural_patterns._12_proxy._02_after_interface.DefaultGameService;
import _02_structural_patterns._12_proxy._02_after_interface.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameService = getGameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[]{GameService.class},
                (proxy, method, args) -> {
                    System.out.println("Hello dynamic Proxy Start");
                    method.invoke(target, args);
                    System.out.println("Hello dynamic Proxy End");
                    return null;
                });

    }
}
