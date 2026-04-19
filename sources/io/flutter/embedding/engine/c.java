package io.flutter.embedding.engine;

import android.content.Context;
import fc.a;
import hc.d;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<io.flutter.embedding.engine.a> f12890a = new ArrayList();

    class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.engine.a f12891a;

        a(io.flutter.embedding.engine.a aVar) {
            this.f12891a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            c.this.f12890a.remove(this.f12891a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f12893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.b f12894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f12895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f12896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f12897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12898f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f12899g = false;

        public b(Context context) {
            this.f12893a = context;
        }

        public boolean a() {
            return this.f12898f;
        }

        public Context b() {
            return this.f12893a;
        }

        public a.b c() {
            return this.f12894b;
        }

        public List<String> d() {
            return this.f12896d;
        }

        public String e() {
            return this.f12895c;
        }

        public e f() {
            return this.f12897e;
        }

        public boolean g() {
            return this.f12899g;
        }

        public b h(boolean z10) {
            this.f12898f = z10;
            return this;
        }

        public b i(a.b bVar) {
            this.f12894b = bVar;
            return this;
        }

        public b j(List<String> list) {
            this.f12896d = list;
            return this;
        }

        public b k(String str) {
            this.f12895c = str;
            return this;
        }

        public b l(boolean z10) {
            this.f12899g = z10;
            return this;
        }
    }

    public c(Context context, String[] strArr) {
        d dVarC = cc.a.e().c();
        if (dVarC.k()) {
            return;
        }
        dVarC.m(context.getApplicationContext());
        dVarC.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(b bVar) {
        io.flutter.embedding.engine.a aVarZ;
        Context contextB = bVar.b();
        a.b bVarC = bVar.c();
        String strE = bVar.e();
        List<String> listD = bVar.d();
        e eVarF = bVar.f();
        if (eVarF == null) {
            eVarF = new e();
        }
        e eVar = eVarF;
        boolean zA = bVar.a();
        boolean zG = bVar.g();
        a.b bVarA = bVarC == null ? a.b.a() : bVarC;
        if (this.f12890a.size() == 0) {
            aVarZ = b(contextB, eVar, zA, zG);
            if (strE != null) {
                aVarZ.n().c(strE);
            }
            aVarZ.j().j(bVarA, listD);
        } else {
            aVarZ = this.f12890a.get(0).z(contextB, bVarA, strE, listD, eVar, zA, zG);
        }
        this.f12890a.add(aVarZ);
        aVarZ.e(new a(aVarZ));
        return aVarZ;
    }

    io.flutter.embedding.engine.a b(Context context, e eVar, boolean z10, boolean z11) {
        return new io.flutter.embedding.engine.a(context, null, null, eVar, null, z10, z11, this);
    }
}
