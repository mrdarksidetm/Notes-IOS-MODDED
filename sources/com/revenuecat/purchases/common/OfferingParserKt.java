package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.PackageType;
import je.v;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] packageTypeArrValues = PackageType.values();
        int length = packageTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                packageType = null;
                break;
            }
            packageType = packageTypeArrValues[i10];
            if (r.b(packageType.getIdentifier(), str)) {
                break;
            }
            i10++;
        }
        return packageType == null ? v.G(str, "$rc_", false, 2, null) ? PackageType.UNKNOWN : PackageType.CUSTOM : packageType;
    }
}
