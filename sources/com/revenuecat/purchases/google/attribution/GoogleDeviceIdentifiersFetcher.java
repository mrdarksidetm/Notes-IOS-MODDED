package com.revenuecat.purchases.google.attribution;

import ae.r;
import android.app.Application;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import i8.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import md.i0;
import md.x;
import nd.r0;
import t8.i;
import t8.j;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        r.f(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    private final String getAdvertisingID(Application application) {
        LogIntent logIntent;
        String str;
        try {
            a.C0303a c0303aA = a.a(application);
            if (!c0303aA.b()) {
                if (!r.b(c0303aA.a(), this.noPermissionAdvertisingIdValue)) {
                    return c0303aA.a();
                }
                LogWrapperKt.log(LogIntent.WARNING, AttributionStrings.GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE);
            }
        } catch (IOException e10) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (NoSuchMethodError unused) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, AttributionStrings.NO_SUCH_METHOD_WHEN_FETCHING_ADVERTISING_IDENTIFIER);
        } catch (NullPointerException e11) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e11.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (TimeoutException e12) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e12.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (i e13) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e13.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (j e14) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e14.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, l lVar) {
        r.f(googleDeviceIdentifiersFetcher, "this$0");
        r.f(application, "$applicationContext");
        r.f(lVar, "$completion");
        lVar.invoke(MapExtensionsKt.filterNotNullValues(r0.h(x.a(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), x.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.f7427af), x.a(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), b.f7427af))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(final Application application, final l<? super Map<String, String>, i0> lVar) {
        r.f(application, "applicationContext");
        r.f(lVar, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: pb.a
            @Override // java.lang.Runnable
            public final void run() {
                GoogleDeviceIdentifiersFetcher.getDeviceIdentifiers$lambda$0(this.f18307a, application, lVar);
            }
        }, null, 2, null);
    }
}
