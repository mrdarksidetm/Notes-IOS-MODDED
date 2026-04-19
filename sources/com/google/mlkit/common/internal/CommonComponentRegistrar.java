package com.google.mlkit.common.internal;

import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.firebase.components.ComponentRegistrar;
import da.c;
import da.g;
import da.q;
import java.util.List;
import va.c;
import wa.a;
import wa.d;
import wa.f;
import wa.j;
import xa.b;

/* JADX INFO: loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzaq.zzi(j.f22725b, c.e(b.class).b(q.i(f.class)).d(new g() { // from class: ta.a
            @Override // da.g
            public final Object a(da.d dVar) {
                return new xa.b((wa.f) dVar.a(wa.f.class));
            }
        }).c(), c.e(wa.g.class).d(new g() { // from class: ta.b
            @Override // da.g
            public final Object a(da.d dVar) {
                return new wa.g();
            }
        }).c(), c.e(va.c.class).b(q.k(c.a.class)).d(new g() { // from class: ta.c
            @Override // da.g
            public final Object a(da.d dVar) {
                return new va.c(dVar.d(c.a.class));
            }
        }).c(), da.c.e(d.class).b(q.j(wa.g.class)).d(new g() { // from class: ta.d
            @Override // da.g
            public final Object a(da.d dVar) {
                return new wa.d(dVar.c(wa.g.class));
            }
        }).c(), da.c.e(a.class).d(new g() { // from class: ta.e
            @Override // da.g
            public final Object a(da.d dVar) {
                return wa.a.a();
            }
        }).c(), da.c.e(wa.b.class).b(q.i(a.class)).d(new g() { // from class: ta.f
            @Override // da.g
            public final Object a(da.d dVar) {
                return new wa.b((wa.a) dVar.a(wa.a.class));
            }
        }).c(), da.c.e(ua.a.class).b(q.i(f.class)).d(new g() { // from class: ta.g
            @Override // da.g
            public final Object a(da.d dVar) {
                return new ua.a((wa.f) dVar.a(wa.f.class));
            }
        }).c(), da.c.m(c.a.class).b(q.j(ua.a.class)).d(new g() { // from class: ta.h
            @Override // da.g
            public final Object a(da.d dVar) {
                return new c.a(va.a.class, dVar.c(ua.a.class));
            }
        }).c());
    }
}
