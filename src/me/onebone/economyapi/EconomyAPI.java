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
    
    public boolean createAccount(Player player, double defaultMoney) {
       EconomyAPI.createAccount(player, defaultMoney);
    }
    public boolean createAccount(Player player, double defaultMoney, boolean force) {
    
    public boolean createAccount(IPlayer player) {
    
    public boolean createAccount(IPlayer player, double defaultMoney) {
       EconomyAPI.createAccount(player, defaultMoney);
    }
    public boolean createAccount(IPlayer player, double defaultMoney, boolean force) {
    
    public boolean createAccount(UUID id, double defaultMoney) {
       EconomyAPI.createAccount(id, defaultMoney);
    }
    public boolean createAccount(UUID id, double defaultMoney, boolean force) {
    
    public boolean createAccount(String id, double defaultMoney, boolean force) {
    
    private boolean createAccountInternal(String id, double defaultMoney, boolean force) {
    
    
