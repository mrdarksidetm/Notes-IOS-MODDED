package com.revenuecat.purchases.amazon;

import ae.r;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.v;
import je.w;
import nd.c0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern patternCompile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        r.e(patternCompile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = patternCompile;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r10.equals("SemiAnnual") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r10.equals("SemiAnnually") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r10.equals("Annually") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return new com.revenuecat.purchases.models.Period(6, com.revenuecat.purchases.models.Period.Unit.MONTH, "P6M");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.YEAR, "P1Y");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r10.equals("Annual") == false) goto L39;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.revenuecat.purchases.models.Period createPeriod(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.StoreProductConversionsKt.createPeriod(java.lang.String):com.revenuecat.purchases.models.Period");
    }

    public static final Price createPrice(String str, String str2) {
        r.f(str, "<this>");
        r.f(str2, b.f7439m);
        BigDecimal priceUsingRegex = parsePriceUsingRegex(str);
        if (priceUsingRegex == null) {
            priceUsingRegex = BigDecimal.ZERO;
        }
        r.e(priceUsingRegex, "priceNumeric");
        BigDecimal bigDecimalMultiply = priceUsingRegex.multiply(new BigDecimal(UtilsKt.MICROS_MULTIPLIER));
        r.e(bigDecimalMultiply, "this.multiply(other)");
        return new Price(str, bigDecimalMultiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(str2));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        r.f(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String strGroup = matcher.group();
        r.e(strGroup, "dirtyPrice");
        String string = w.W0(v.C(v.C(v.C(strGroup, " ", "", false, 4, null), " ", "", false, 4, null), " ", "", false, 4, null)).toString();
        List listC0 = w.C0(string, new String[]{".", f.f7478a}, false, 0, 6, null);
        if (listC0.size() != 1) {
            if (((String) c0.j0(listC0)).length() == 3) {
                string = v.C(v.C(string, ".", "", false, 4, null), f.f7478a, "", false, 4, null);
            } else {
                string = c0.h0(c0.U(listC0, 1), "", null, null, 0, null, null, 62, null) + com.amazon.a.a.o.c.a.b.f7490a + ((String) c0.j0(listC0));
            }
        }
        return new BigDecimal(w.W0(string).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String str) throws JSONException {
        r.f(product, "<this>");
        r.f(str, b.f7439m);
        if (product.getPrice() == null) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str2 = String.format(AmazonStrings.PRODUCT_PRICE_MISSING, Arrays.copyOf(new Object[]{product.getSku()}, 1));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
            return null;
        }
        String price = product.getPrice();
        r.e(price, b.f7450x);
        Price priceCreatePrice = createPrice(price, str);
        String sku = product.getSku();
        r.e(sku, "sku");
        ProductType productType = product.getProductType();
        r.e(productType, "productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        r.e(title, b.S);
        String title2 = product.getTitle();
        r.e(title2, b.S);
        String description = product.getDescription();
        r.e(description, b.f7429c);
        String subscriptionPeriod = product.getSubscriptionPeriod();
        Period periodCreatePeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
        String smallIconUrl = product.getSmallIconUrl();
        r.e(smallIconUrl, "smallIconUrl");
        String freeTrialPeriod = product.getFreeTrialPeriod();
        Period periodCreatePeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
        JSONObject json = product.toJSON();
        r.e(json, "this.toJSON()");
        return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, periodCreatePeriod, priceCreatePrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, periodCreatePeriod2, json, (PresentedOfferingContext) null);
    }
}
