package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f3276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f3277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f3280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f3281g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(l lVar) {
            Set<String> setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(lVar.i()).setLabel(lVar.h()).setChoices(lVar.e()).setAllowFreeFormInput(lVar.c()).addExtras(lVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = lVar.d()) != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(builderAddExtras, lVar.f());
            }
            return builderAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(l lVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(l.a(lVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    static RemoteInput a(l lVar) {
        return a.b(lVar);
    }

    static RemoteInput[] b(l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lVarArr.length];
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            remoteInputArr[i10] = a(lVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f3278d;
    }

    public Set<String> d() {
        return this.f3281g;
    }

    public CharSequence[] e() {
        return this.f3277c;
    }

    public int f() {
        return this.f3279e;
    }

    public Bundle g() {
        return this.f3280f;
    }

    public CharSequence h() {
        return this.f3276b;
    }

    public String i() {
        return this.f3275a;
    }

    public boolean j() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
