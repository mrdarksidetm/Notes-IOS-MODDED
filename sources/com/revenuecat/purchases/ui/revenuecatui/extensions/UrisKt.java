package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.r;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class UrisKt {
    public static final void openUriOrElse(Context context, String str, l<? super Exception, i0> lVar) {
        r.f(context, "<this>");
        r.f(str, "uri");
        r.f(lVar, "fallbackAction");
        try {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e10) {
                lVar.invoke(e10);
            }
        } catch (IllegalArgumentException e11) {
            lVar.invoke(e11);
        }
    }
}
