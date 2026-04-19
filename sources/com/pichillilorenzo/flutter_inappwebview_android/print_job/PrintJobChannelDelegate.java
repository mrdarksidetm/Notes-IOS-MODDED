package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController, j jVar) {
        super(jVar);
        this.printJobController = printJobController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        PrintJobInfoExt info;
        Boolean bool;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "cancel":
                PrintJobController printJobController = this.printJobController;
                if (printJobController != null) {
                    printJobController.cancel();
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            case "getInfo":
                PrintJobController printJobController2 = this.printJobController;
                Map<String, Object> map = null;
                if (printJobController2 != null && (info = printJobController2.getInfo()) != null) {
                    map = info.toMap();
                }
                dVar.success(map);
                break;
            case "restart":
                PrintJobController printJobController3 = this.printJobController;
                if (printJobController3 != null) {
                    printJobController3.restart();
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            case "dispose":
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 != null) {
                    printJobController4.dispose();
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
