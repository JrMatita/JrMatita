    
    
    getServer().getPluginManager().registerEvents(new PlayerMoveEvent(), this);
    getServer().getPluginManager().registerEvents(new PlayerInteractEvent(), this);

    
    this.getCommand("Inizia").setExecutor(new inizia());
    this.getCommand("Vai").setExecutor(new Vai());
    this.getCommand("Non Fermarti").setExecutor(new Non fermarti());


