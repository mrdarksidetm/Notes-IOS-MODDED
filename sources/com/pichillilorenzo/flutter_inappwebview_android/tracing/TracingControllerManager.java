package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import f5.j;
import f5.k;
import f5.s;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class TracingControllerManager implements Disposable {
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static k tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static f5.j buildTracingConfig(TracingSettings tracingSettings) {
        j.a aVar = new j.a();
        for (Object obj : tracingSettings.categories) {
            if (obj instanceof String) {
                aVar.b((String) obj);
            }
            if (obj instanceof Integer) {
                aVar.a(((Integer) obj).intValue());
            }
        }
        Integer num = tracingSettings.tracingMode;
        if (num != null) {
            aVar.d(num.intValue());
        }
        return aVar.c();
    }

    public static void init() {
        if (tracingController == null && s.a("TRACING_CONTROLLER_BASIC_USAGE")) {
            tracingController = k.a();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}
