package com.revenuecat.purchases.amazon.attribution;

import ae.r;
import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Arrays;
import java.util.Map;
import md.i0;
import md.x;
import nd.r0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application application, l<? super Map<String, String>, i0> lVar) {
        ContentResolver contentResolver;
        r.f(application, "applicationContext");
        r.f(lVar, "completion");
        try {
            contentResolver = application.getContentResolver();
        } catch (Settings.SettingNotFoundException e10) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AttributionStrings.AMAZON_COULD_NOT_GET_ADID, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        String string = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0 ? Settings.Secure.getString(contentResolver, "advertising_id") : null;
        lVar.invoke(MapExtensionsKt.filterNotNullValues(r0.h(x.a(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), string), x.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.f7427af), x.a(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), b.f7427af))));
    }
}
