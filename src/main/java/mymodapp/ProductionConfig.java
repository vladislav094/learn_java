package mymodapp;

public class ProductionConfig {

    private static ProductionConfig prodConfig;

    private ProductionConfig() {
    }

    public static ProductionConfig getInstance(ProductionConfig prodConfig) {
        if (prodConfig == null) {
            prodConfig = new ProductionConfig();
        }
        return prodConfig;
    }

}
