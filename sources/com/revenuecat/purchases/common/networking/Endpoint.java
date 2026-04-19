package com.revenuecat.purchases.common.networking;

import ae.j;
import ae.r;
import android.net.Uri;
import com.amazon.a.a.o.b;
import java.util.Arrays;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Endpoint {
    private final String name;
    private final String pathTemplate;

    public static final class GetAmazonReceipt extends Endpoint {
        private final String receiptId;
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAmazonReceipt(String str, String str2) {
            super("/receipts/amazon/%s/%s", "get_amazon_receipt", null);
            r.f(str, "userId");
            r.f(str2, b.E);
            this.userId = str;
            this.receiptId = str2;
        }

        public static /* synthetic */ GetAmazonReceipt copy$default(GetAmazonReceipt getAmazonReceipt, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getAmazonReceipt.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = getAmazonReceipt.receiptId;
            }
            return getAmazonReceipt.copy(str, str2);
        }

        public final String component1() {
            return this.userId;
        }

        public final String component2() {
            return this.receiptId;
        }

        public final GetAmazonReceipt copy(String str, String str2) {
            r.f(str, "userId");
            r.f(str2, b.E);
            return new GetAmazonReceipt(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAmazonReceipt)) {
                return false;
            }
            GetAmazonReceipt getAmazonReceipt = (GetAmazonReceipt) obj;
            return r.b(this.userId, getAmazonReceipt.userId) && r.b(this.receiptId, getAmazonReceipt.receiptId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), this.receiptId}, 2));
            r.e(str, "format(this, *args)");
            return str;
        }

        public final String getReceiptId() {
            return this.receiptId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.receiptId.hashCode();
        }

        public String toString() {
            return "GetAmazonReceipt(userId=" + this.userId + ", receiptId=" + this.receiptId + ')';
        }
    }

    public static final class GetCustomerCenterConfig extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerCenterConfig(String str) {
            super("/customercenter/%s", "get_customer_center_config", null);
            r.f(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetCustomerCenterConfig copy$default(GetCustomerCenterConfig getCustomerCenterConfig, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getCustomerCenterConfig.userId;
            }
            return getCustomerCenterConfig.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerCenterConfig copy(String str) {
            r.f(str, "userId");
            return new GetCustomerCenterConfig(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerCenterConfig) && r.b(this.userId, ((GetCustomerCenterConfig) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            r.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerCenterConfig(userId=" + this.userId + ')';
        }
    }

    public static final class GetCustomerInfo extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerInfo(String str) {
            super("/subscribers/%s", "get_customer", null);
            r.f(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetCustomerInfo copy$default(GetCustomerInfo getCustomerInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getCustomerInfo.userId;
            }
            return getCustomerInfo.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerInfo copy(String str) {
            r.f(str, "userId");
            return new GetCustomerInfo(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerInfo) && r.b(this.userId, ((GetCustomerInfo) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            r.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerInfo(userId=" + this.userId + ')';
        }
    }

    public static final class GetOfferings extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOfferings(String str) {
            super("/subscribers/%s/offerings", "get_offerings", null);
            r.f(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetOfferings copy$default(GetOfferings getOfferings, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getOfferings.userId;
            }
            return getOfferings.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetOfferings copy(String str) {
            r.f(str, "userId");
            return new GetOfferings(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetOfferings) && r.b(this.userId, ((GetOfferings) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            r.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetOfferings(userId=" + this.userId + ')';
        }
    }

    public static final class GetProductEntitlementMapping extends Endpoint {
        public static final GetProductEntitlementMapping INSTANCE = new GetProductEntitlementMapping();

        private GetProductEntitlementMapping() {
            super("/product_entitlement_mapping", "get_product_entitlement_mapping", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class LogIn extends Endpoint {
        public static final LogIn INSTANCE = new LogIn();

        private LogIn() {
            super("/subscribers/identify", "log_in", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostAttributes extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostAttributes(String str) {
            super("/subscribers/%s/attributes", "post_attributes", null);
            r.f(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ PostAttributes copy$default(PostAttributes postAttributes, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = postAttributes.userId;
            }
            return postAttributes.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final PostAttributes copy(String str) {
            r.f(str, "userId");
            return new PostAttributes(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostAttributes) && r.b(this.userId, ((PostAttributes) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            r.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "PostAttributes(userId=" + this.userId + ')';
        }
    }

    public static final class PostDiagnostics extends Endpoint {
        public static final PostDiagnostics INSTANCE = new PostDiagnostics();

        private PostDiagnostics() {
            super("/diagnostics", "post_diagnostics", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostPaywallEvents extends Endpoint {
        public static final PostPaywallEvents INSTANCE = new PostPaywallEvents();

        private PostPaywallEvents() {
            super("/events", "post_paywall_events", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostReceipt extends Endpoint {
        public static final PostReceipt INSTANCE = new PostReceipt();

        private PostReceipt() {
            super("/receipts", "post_receipt", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostRedeemWebPurchase extends Endpoint {
        public static final PostRedeemWebPurchase INSTANCE = new PostRedeemWebPurchase();

        private PostRedeemWebPurchase() {
            super("/subscribers/redeem_purchase", "post_redeem_web_purchase", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    private Endpoint(String str, String str2) {
        this.pathTemplate = str;
        this.name = str2;
    }

    public /* synthetic */ Endpoint(String str, String str2, j jVar) {
        this(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsNonceToPerformSigning() {
        if (this instanceof GetCustomerInfo ? true : r.b(this, LogIn.INSTANCE) ? true : r.b(this, PostReceipt.INSTANCE) ? true : r.b(this, PostRedeemWebPurchase.INSTANCE)) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof GetOfferings ? true : this instanceof PostAttributes ? true : r.b(this, PostDiagnostics.INSTANCE) ? true : r.b(this, PostPaywallEvents.INSTANCE) ? true : r.b(this, GetProductEntitlementMapping.INSTANCE) ? true : this instanceof GetCustomerCenterConfig) {
            return false;
        }
        throw new q();
    }

    public abstract String getPath();

    public final String getPathTemplate() {
        return this.pathTemplate;
    }

    public final boolean getSupportsSignatureVerification() {
        if (this instanceof GetCustomerInfo ? true : r.b(this, LogIn.INSTANCE) ? true : r.b(this, PostReceipt.INSTANCE) ? true : this instanceof GetOfferings ? true : r.b(this, GetProductEntitlementMapping.INSTANCE) ? true : r.b(this, PostRedeemWebPurchase.INSTANCE)) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof PostAttributes ? true : r.b(this, PostDiagnostics.INSTANCE) ? true : r.b(this, PostPaywallEvents.INSTANCE) ? true : this instanceof GetCustomerCenterConfig) {
            return false;
        }
        throw new q();
    }
}
