package androidx.compose.ui.focus;

import ae.s;
import j1.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2723b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f2724c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f2725d = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<m> f2726a = new v0.d<>(new m[16], 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final f a() {
            return f.f2725d;
        }

        public final f b() {
            return f.f2724c;
        }
    }

    static final class b extends s implements zd.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2727a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(h.j(focusTargetNode));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100 A[EDGE_INSN: B:86:0x0100->B:70:0x0100 BREAK  A[LOOP:1: B:25:0x0064->B:89:0x0064], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007a -> B:23:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.f.c():boolean");
    }

    public final v0.d<m> d() {
        return this.f2726a;
    }
}
