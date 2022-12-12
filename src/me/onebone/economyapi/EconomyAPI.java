package me.onebone.economyapi;
import cn.nukkit.Player;
import net.lldv.llamaeconomy.LlamaEconomy;
import net.lldv.llamaeconomy.components.api.API;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
public class EconomyAPI {
    private final API EconomyAPI;
    public EconomyAPI() {
        EconomyAPI = API.getInstance();
    }
    public boolean createAccount(Player player) {
       EconomyAPI.createAccount(player);
    }
    public boolean createAccount(Player player, double defaultMoney) {
       EconomyAPI.createAccount(player, defaultMoney);
    }
    public boolean createAccount(Player player, double defaultMoney, boolean force) {
       EconomyAPI.createAccount(player, defaultMoney, force);
    }
    public boolean createAccount(IPlayer player) {
       EconomyAPI.createAccount(player);
    }
    public boolean createAccount(IPlayer player, double defaultMoney) {
       EconomyAPI.createAccount(player, defaultMoney);
    }
    public boolean createAccount(IPlayer player, double defaultMoney, boolean force) {
       EconomyAPI.createAccount(player, defaultMoney, force);
    }
    public boolean createAccount(UUID id, double defaultMoney) {
       EconomyAPI.createAccount(id, defaultMoney);
    }
    public boolean createAccount(UUID id, double defaultMoney, boolean force) {
       EconomyAPI.createAccount(id, defaultMoney, force);
    }
    public boolean createAccount(String id, double defaultMoney, boolean force) {
       EconomyAPI.createAccount(id, defaultMoney, force);
    }
    public double myMoney(Player player) {
       EconomyAPI.getMoney(player);
    }
    public double myMoney(IPlayer player) {
       EconomyAPI.getMoney(player);
    }
    public double myMoney(UUID id) {
       EconomyAPI.getMoney(id);
    }
    public double myMoney(String id) {
       EconomyAPI.getMoney(id);
    }
    public int setMoney(Player player, double amount) {
       EconomyAPI.setMoney(player, amount);
    }
    public int setMoney(Player player, double amount, boolean force) {
       EconomyAPI.setMoney(player, amount, force);
    }
    public int setMoney(IPlayer player, double amount) {
       EconomyAPI.setMoney(player, amount);
    }
    public int setMoney(IPlayer player, double amount, boolean force) {
       EconomyAPI.setMoney(player, amount, force);
    }
    public int setMoney(UUID id, double amount) {
       EconomyAPI.setMoney(id, amount);
    }
    public int setMoney(UUID id, double amount, boolean force) {
       EconomyAPI.setMoney(id, amount, force);
    }
    public int setMoney(String id, double amount) {
       EconomyAPI.setMoney(id, amount);
    }
    public int addMoney(Player player, double amount) {
       EconomyAPI.addMoney(player, amount);
    }
    public int addMoney(Player player, double amount, boolean force) {
       EconomyAPI.addMoney(player, amount, force);
    }
    public int addMoney(IPlayer player, double amount) {
       EconomyAPI.addMoney(player, amount);
    }
    public int addMoney(IPlayer player, double amount, boolean force) {
       EconomyAPI.addMoney(player, amount, force);
    }
    public int addMoney(UUID id, double amount) {
       EconomyAPI.addMoney(id, amount);
    }
    public int addMoney(UUID id, double amount, boolean force) {
       EconomyAPI.addMoney(id, amount, force);
    }
    public int addMoney(String id, double amount) {
       EconomyAPI.addMoney(id, amount);
    }
    public int addMoney(String id, double amount, boolean force) {
       EconomyAPI.addMoney(id, amount, force);
    }
    public int reduceMoney(Player player, double amount) {
       EconomyAPI.reduceMoney(player, amount);
    }
    public int reduceMoney(Player player, double amount, boolean force) {
       EconomyAPI.reduceMoney(player, amount, force);
    }
    public int reduceMoney(IPlayer player, double amount) {
       EconomyAPI.reduceMoney(player, amount);
    }
    public int reduceMoney(IPlayer player, double amount, boolean force) {
       EconomyAPI.reduceMoney(player, amount, force);
    }
