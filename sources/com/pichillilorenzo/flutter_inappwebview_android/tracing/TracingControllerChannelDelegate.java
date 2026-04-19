package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import f5.k;
import f5.s;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, j jVar) {
        super(jVar);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        k kVar;
        Boolean boolValueOf;
        FileOutputStream fileOutputStream;
        TracingControllerManager.init();
        kVar = TracingControllerManager.tracingController;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "isTracing":
                if (kVar != null) {
                    boolValueOf = Boolean.valueOf(kVar.b());
                }
                dVar.success(boolValueOf);
            case "stop":
                if (kVar != null && s.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    String str2 = (String) iVar.a("filePath");
                    if (str2 != null) {
                        try {
                            fileOutputStream = new FileOutputStream(str2);
                        } catch (FileNotFoundException e10) {
                            e10.printStackTrace();
                        }
                        break;
                    } else {
                        fileOutputStream = null;
                    }
                    dVar.success(Boolean.valueOf(kVar.d(fileOutputStream, Executors.newSingleThreadExecutor())));
                    return;
                }
                break;
            case "start":
                if (kVar != null && s.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    Map<String, Object> map = (Map) iVar.a("settings");
                    TracingSettings tracingSettings = new TracingSettings();
                    tracingSettings.parse2(map);
                    kVar.c(TracingControllerManager.buildTracingConfig(tracingSettings));
                    boolValueOf = Boolean.TRUE;
                }
                dVar.success(boolValueOf);
            default:
                dVar.notImplemented();
                return;
        }
        boolValueOf = Boolean.FALSE;
        dVar.success(boolValueOf);
    }
}
