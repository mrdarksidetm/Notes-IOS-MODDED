package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalizationKt {
    /* JADX INFO: renamed from: image-7v81vok, reason: not valid java name */
    public static final /* synthetic */ Result m88image7v81vok(Map map, String str) {
        r.f(map, "$this$image");
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Object obj = map.get(LocalizationKey.m61boximpl(str));
        ThemeImageUrls themeImageUrlsM49unboximpl = obj instanceof LocalizationData.Image ? ((LocalizationData.Image) obj).m49unboximpl() : null;
        return themeImageUrlsM49unboximpl != null ? new Result.Success(themeImageUrlsM49unboximpl) : new Result.Error(new PaywallValidationError.MissingImageLocalization(str, null));
    }

    /* JADX INFO: renamed from: string-7v81vok, reason: not valid java name */
    public static final /* synthetic */ Result m89string7v81vok(Map map, String str) {
        r.f(map, "$this$string");
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Object obj = map.get(LocalizationKey.m61boximpl(str));
        String strM58unboximpl = obj instanceof LocalizationData.Text ? ((LocalizationData.Text) obj).m58unboximpl() : null;
        return strM58unboximpl != null ? new Result.Success(strM58unboximpl) : new Result.Error(new PaywallValidationError.MissingStringLocalization(str, null));
    }
}
