package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f3795o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f3796p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f3797q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<f> f3799b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f3802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f3803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f3804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f3805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f3806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f3807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f3808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f3810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0093e f3811n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f3798a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f3800c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f3801d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f3812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile l f3813c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0092a extends i {
            C0092a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                a.this.f3815a.n(th);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f3815a.f3803f.a(new C0092a());
            } catch (Throwable th) {
                this.f3815a.n(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f3812b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3813c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3815a.f3805h);
        }

        void d(l lVar) {
            if (lVar == null) {
                this.f3815a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3813c = lVar;
            l lVar2 = this.f3813c;
            j jVar = this.f3815a.f3804g;
            InterfaceC0093e interfaceC0093e = this.f3815a.f3811n;
            e eVar = this.f3815a;
            this.f3812b = new androidx.emoji2.text.h(lVar2, jVar, interfaceC0093e, eVar.f3806i, eVar.f3807j, androidx.emoji2.text.g.a());
            this.f3815a.o();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f3815a;

        b(e eVar) {
            this.f3815a = eVar;
        }

        void a() {
            throw null;
        }

        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f3816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f3817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f3820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set<f> f3821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f3822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3823h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3824i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        InterfaceC0093e f3825j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            n3.g.i(hVar, "metadataLoader cannot be null.");
            this.f3816a = hVar;
        }

        protected final h a() {
            return this.f3816a;
        }

        public c b(int i10) {
            this.f3824i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public g4.a a(m mVar) {
            return new g4.c(mVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0093e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f> f3826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f3827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3828c;

        g(f fVar, int i10) {
            this(Arrays.asList((f) n3.g.i(fVar, "initCallback cannot be null")), i10, null);
        }

        g(Collection<f> collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection<f> collection, int i10, Throwable th) {
            n3.g.i(collection, "initCallbacks cannot be null");
            this.f3826a = new ArrayList(collection);
            this.f3828c = i10;
            this.f3827b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3826a.size();
            int i10 = 0;
            if (this.f3828c != 1) {
                while (i10 < size) {
                    this.f3826a.get(i10).a(this.f3827b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f3826a.get(i10).b();
                    i10++;
                }
            }
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    public interface j {
        g4.a a(m mVar);
    }

    private e(c cVar) {
        this.f3805h = cVar.f3818c;
        this.f3806i = cVar.f3819d;
        this.f3807j = cVar.f3820e;
        this.f3808k = cVar.f3822g;
        this.f3809l = cVar.f3823h;
        this.f3803f = cVar.f3816a;
        this.f3810m = cVar.f3824i;
        this.f3811n = cVar.f3825j;
        z.b bVar = new z.b();
        this.f3799b = bVar;
        j jVar = cVar.f3817b;
        this.f3804g = jVar == null ? new d() : jVar;
        Set<f> set = cVar.f3821f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3821f);
        }
        this.f3802e = new a(this);
        m();
    }

    public static e c() {
        e eVar;
        synchronized (f3795o) {
            eVar = f3797q;
            n3.g.j(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.c(editable, i10, keyEvent);
    }

    public static e h(c cVar) {
        e eVar = f3797q;
        if (eVar == null) {
            synchronized (f3795o) {
                eVar = f3797q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f3797q = eVar;
                }
            }
        }
        return eVar;
    }

    public static boolean i() {
        return f3797q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f3798a.writeLock().lock();
        try {
            if (this.f3810m == 0) {
                this.f3800c = 0;
            }
            this.f3798a.writeLock().unlock();
            if (e() == 0) {
                this.f3802e.a();
            }
        } catch (Throwable th) {
            this.f3798a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f3809l;
    }

    public int e() {
        this.f3798a.readLock().lock();
        try {
            return this.f3800c;
        } finally {
            this.f3798a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f3808k;
    }

    public void l() {
        n3.g.j(this.f3810m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f3798a.writeLock().lock();
        try {
            if (this.f3800c == 0) {
                return;
            }
            this.f3800c = 0;
            this.f3798a.writeLock().unlock();
            this.f3802e.a();
        } finally {
            this.f3798a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3798a.writeLock().lock();
        try {
            this.f3800c = 2;
            arrayList.addAll(this.f3799b);
            this.f3799b.clear();
            this.f3798a.writeLock().unlock();
            this.f3801d.post(new g(arrayList, this.f3800c, th));
        } catch (Throwable th2) {
            this.f3798a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f3798a.writeLock().lock();
        try {
            this.f3800c = 1;
            arrayList.addAll(this.f3799b);
            this.f3799b.clear();
            this.f3798a.writeLock().unlock();
            this.f3801d.post(new g(arrayList, this.f3800c));
        } catch (Throwable th) {
            this.f3798a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, a.e.API_PRIORITY_OTHER);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        n3.g.j(k(), "Not initialized yet");
        n3.g.f(i10, "start cannot be negative");
        n3.g.f(i11, "end cannot be negative");
        n3.g.f(i12, "maxEmojiCount cannot be negative");
        n3.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        n3.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        n3.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f3805h : false;
        } else {
            z10 = true;
        }
        return this.f3802e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(f fVar) {
        n3.g.i(fVar, "initCallback cannot be null");
        this.f3798a.writeLock().lock();
        try {
            if (this.f3800c == 1 || this.f3800c == 2) {
                this.f3801d.post(new g(fVar, this.f3800c));
            } else {
                this.f3799b.add(fVar);
            }
        } finally {
            this.f3798a.writeLock().unlock();
        }
    }

    public void u(f fVar) {
        n3.g.i(fVar, "initCallback cannot be null");
        this.f3798a.writeLock().lock();
        try {
            this.f3799b.remove(fVar);
        } finally {
            this.f3798a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3802e.c(editorInfo);
    }
}
