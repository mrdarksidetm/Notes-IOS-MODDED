package wc;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import rc.k;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f22855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rc.k f22856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f22857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k.j f22858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final k.h f22860f;

    class a implements k.h {
        a() {
        }

        @Override // rc.k.h
        public void a() {
            e.this.t();
        }

        @Override // rc.k.h
        public void f(boolean z10) {
            e.this.w(z10);
        }

        @Override // rc.k.h
        public void g(k.c cVar) {
            e.this.x(cVar);
        }

        @Override // rc.k.h
        public void h(List<k.l> list) {
            e.this.A(list);
        }

        @Override // rc.k.h
        public void i(k.j jVar) {
            e.this.C(jVar);
        }

        @Override // rc.k.h
        public void j(k.i iVar) {
            e.this.s(iVar);
        }

        @Override // rc.k.h
        public void k(String str) {
            e.this.v(str);
        }

        @Override // rc.k.h
        public void l(String str) {
            e.this.D(str);
        }

        @Override // rc.k.h
        public void m(k.EnumC0406k enumC0406k) {
            e.this.z(enumC0406k);
        }

        @Override // rc.k.h
        public void n(k.g gVar) {
            e.this.F(gVar);
        }

        @Override // rc.k.h
        public void o() {
            e.this.y();
        }

        @Override // rc.k.h
        public CharSequence p(k.e eVar) {
            return e.this.r(eVar);
        }

        @Override // rc.k.h
        public void q() {
            e.this.u();
        }

        @Override // rc.k.h
        public void r(int i10) {
            e.this.B(i10);
        }

        @Override // rc.k.h
        public boolean s() {
            return e.this.p();
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22862a;

        b(View view) {
            this.f22862a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            rc.k kVar;
            boolean z10;
            if ((i10 & 4) == 0) {
                kVar = e.this.f22856b;
                z10 = true;
            } else {
                kVar = e.this.f22856b;
                z10 = false;
            }
            kVar.m(z10);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i10) {
            this.f22862a.post(new Runnable() { // from class: wc.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22867a.b(i10);
                }
            });
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f22866c;

        static {
            int[] iArr = new int[k.d.values().length];
            f22866c = iArr;
            try {
                iArr[k.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22866c[k.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[k.l.values().length];
            f22865b = iArr2;
            try {
                iArr2[k.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22865b[k.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[k.g.values().length];
            f22864a = iArr3;
            try {
                iArr3[k.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22864a[k.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22864a[k.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22864a[k.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22864a[k.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean a();

        default void f(boolean z10) {
        }
    }

    public e(Activity activity, rc.k kVar, d dVar) {
        a aVar = new a();
        this.f22860f = aVar;
        this.f22855a = activity;
        this.f22856b = kVar;
        kVar.l(aVar);
        this.f22857c = dVar;
        this.f22859e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(List<k.l> list) {
        int i10 = list.size() == 0 ? 5894 : 1798;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = c.f22865b[list.get(i11).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 = i10 & (-513) & (-3);
            }
        }
        this.f22859e = i10;
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i10) {
        this.f22855a.setRequestedOrientation(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(k.j jVar) {
        Window window = this.f22855a.getWindow();
        androidx.core.view.p pVar = new androidx.core.view.p(window, window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        k.d dVar = jVar.f19320b;
        if (dVar != null) {
            int i11 = c.f22866c[dVar.ordinal()];
            if (i11 == 1) {
                pVar.b(true);
            } else if (i11 == 2) {
                pVar.b(false);
            }
        }
        Integer num = jVar.f19319a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = jVar.f19321c;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            k.d dVar2 = jVar.f19323e;
            if (dVar2 != null) {
                int i12 = c.f22866c[dVar2.ordinal()];
                if (i12 == 1) {
                    pVar.a(true);
                } else if (i12 == 2) {
                    pVar.a(false);
                }
            }
            Integer num2 = jVar.f19322d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f19324f;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f19325g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f22858d = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f22855a.startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f22855a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence r(k.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f22855a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != k.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            cc.b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            cc.b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = this.f22855a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.f22855a);
                        if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                            assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        e = e10;
                        charSequence = text;
                    }
                }
                return text;
            } catch (FileNotFoundException unused) {
                cc.b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return null;
            } catch (SecurityException e11) {
                cc.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e11);
                return null;
            }
        } catch (IOException e12) {
            e = e12;
        }
        cc.b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(k.i iVar) {
        if (iVar == k.i.CLICK) {
            this.f22855a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        d dVar = this.f22857c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f22855a;
            if (activity instanceof e.u) {
                ((e.u) activity).getOnBackPressedDispatcher().l();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        ((ClipboardManager) this.f22855a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z10) {
        d dVar = this.f22857c;
        if (dVar != null) {
            dVar.f(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(k.c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f22855a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f19294b, (Bitmap) null, cVar.f19293a));
        } else {
            this.f22855a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f19294b, 0, cVar.f19293a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        View decorView = this.f22855a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(k.EnumC0406k enumC0406k) {
        int i10;
        if (enumC0406k == k.EnumC0406k.LEAN_BACK) {
            i10 = 1798;
        } else if (enumC0406k == k.EnumC0406k.IMMERSIVE) {
            i10 = 3846;
        } else if (enumC0406k == k.EnumC0406k.IMMERSIVE_STICKY) {
            i10 = 5894;
        } else if (enumC0406k != k.EnumC0406k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i10 = 1792;
        }
        this.f22859e = i10;
        E();
    }

    public void E() {
        this.f22855a.getWindow().getDecorView().setSystemUiVisibility(this.f22859e);
        k.j jVar = this.f22858d;
        if (jVar != null) {
            C(jVar);
        }
    }

    void F(k.g gVar) {
        int i10;
        View decorView = this.f22855a.getWindow().getDecorView();
        int i11 = c.f22864a[gVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 == 4) {
                        i10 = 6;
                    } else if (i11 != 5) {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i12);
            return;
        }
        i10 = 0;
        decorView.performHapticFeedback(i10);
    }

    public void q() {
        this.f22856b.l(null);
    }
}
