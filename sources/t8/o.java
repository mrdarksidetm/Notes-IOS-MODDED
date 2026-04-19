package t8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Dialog f21340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DialogInterface.OnCancelListener f21341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Dialog f21342s;

    public static o S(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        o oVar = new o();
        Dialog dialog2 = (Dialog) w8.m.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        oVar.f21340q = dialog2;
        if (onCancelListener != null) {
            oVar.f21341r = onCancelListener;
        }
        return oVar;
    }

    @Override // androidx.fragment.app.m
    public Dialog L(Bundle bundle) {
        Dialog dialog = this.f21340q;
        if (dialog != null) {
            return dialog;
        }
        P(false);
        if (this.f21342s == null) {
            this.f21342s = new AlertDialog.Builder((Context) w8.m.k(getContext())).create();
        }
        return this.f21342s;
    }

    @Override // androidx.fragment.app.m
    public void R(androidx.fragment.app.w wVar, String str) {
        super.R(wVar, str);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21341r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
