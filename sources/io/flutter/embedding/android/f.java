package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.common.api.a;
import io.flutter.plugin.editing.b;
import java.util.HashSet;
import java.util.Map;
import rc.f;

/* JADX INFO: loaded from: classes2.dex */
public class f implements b.a, f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d[] f12823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<KeyEvent> f12824b = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f12825c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12826a = 0;

        Character a(int i10) {
            char c10 = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                int deadChar = i10 & a.e.API_PRIORITY_OTHER;
                int i11 = this.f12826a;
                if (i11 != 0) {
                    deadChar = KeyCharacterMap.getDeadChar(i11, deadChar);
                }
                this.f12826a = deadChar;
            } else {
                int i12 = this.f12826a;
                if (i12 != 0) {
                    int deadChar2 = KeyCharacterMap.getDeadChar(i12, i10);
                    if (deadChar2 > 0) {
                        c10 = (char) deadChar2;
                    }
                    this.f12826a = 0;
                }
            }
            return Character.valueOf(c10);
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final KeyEvent f12827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12829c = false;

        private class a implements d.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f12831a;

            private a() {
                this.f12831a = false;
            }

            @Override // io.flutter.embedding.android.f.d.a
            public void a(boolean z10) {
                if (this.f12831a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f12831a = true;
                c cVar = c.this;
                int i10 = cVar.f12828b - 1;
                cVar.f12828b = i10;
                boolean z11 = z10 | cVar.f12829c;
                cVar.f12829c = z11;
                if (i10 != 0 || z11) {
                    return;
                }
                f.this.e(cVar.f12827a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f12828b = f.this.f12823a.length;
            this.f12827a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z10);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void b(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        sc.b getBinaryMessenger();
    }

    public f(e eVar) {
        this.f12825c = eVar;
        this.f12823a = new d[]{new io.flutter.embedding.android.e(eVar.getBinaryMessenger()), new io.flutter.embedding.android.c(new rc.e(eVar.getBinaryMessenger()))};
        new rc.f(eVar.getBinaryMessenger()).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(KeyEvent keyEvent) {
        e eVar = this.f12825c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f12824b.add(keyEvent);
        this.f12825c.b(keyEvent);
        if (this.f12824b.remove(keyEvent)) {
            cc.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.b.a
    public boolean a(KeyEvent keyEvent) {
        if (this.f12824b.remove(keyEvent)) {
            return false;
        }
        if (this.f12823a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f12823a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    @Override // rc.f.b
    public Map<Long, Long> b() {
        return ((io.flutter.embedding.android.e) this.f12823a[0]).h();
    }

    public void d() {
        int size = this.f12824b.size();
        if (size > 0) {
            cc.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
