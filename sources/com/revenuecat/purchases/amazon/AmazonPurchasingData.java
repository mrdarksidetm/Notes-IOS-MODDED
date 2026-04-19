package com.revenuecat.purchases.amazon;

import ae.j;
import ae.r;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AmazonPurchasingData implements PurchasingData {

    public static final class Product extends AmazonPurchasingData {
        private final AmazonStoreProduct storeProduct;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(AmazonStoreProduct amazonStoreProduct) {
            super(null);
            r.f(amazonStoreProduct, "storeProduct");
            this.storeProduct = amazonStoreProduct;
        }

        public static /* synthetic */ Product copy$default(Product product, AmazonStoreProduct amazonStoreProduct, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amazonStoreProduct = product.storeProduct;
            }
            return product.copy(amazonStoreProduct);
        }

        public final AmazonStoreProduct component1() {
            return this.storeProduct;
        }

        public final Product copy(AmazonStoreProduct amazonStoreProduct) {
            r.f(amazonStoreProduct, "storeProduct");
            return new Product(amazonStoreProduct);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Product) && r.b(this.storeProduct, ((Product) obj).storeProduct);
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.storeProduct.getId();
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public ProductType getProductType() {
            return this.storeProduct.getType();
        }

        public final AmazonStoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return this.storeProduct.hashCode();
        }

        public String toString() {
            return "Product(storeProduct=" + this.storeProduct + ')';
        }
    }

    private AmazonPurchasingData() {
    }

    public /* synthetic */ AmazonPurchasingData(j jVar) {
        this();
    }
}
