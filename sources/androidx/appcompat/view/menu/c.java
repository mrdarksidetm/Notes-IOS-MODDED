package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f1216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f1217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f1218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f1219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f1223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f1224i;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1225a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f1218c.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f1218c.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListZ.get(i10) == gVarV) {
                        this.f1225a = i10;
                        return;
                    }
                }
            }
            this.f1225a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList<g> arrayListZ = c.this.f1218c.z();
            int i11 = i10 + c.this.f1220e;
            int i12 = this.f1225a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f1218c.z().size() - c.this.f1220e;
            return this.f1225a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1217b.inflate(cVar.f1222g, viewGroup, false);
            }
            ((k.a) view).d(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.f1222g = i10;
        this.f1221f = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f1216a = context;
        this.f1217b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1224i == null) {
            this.f1224i = new a();
        }
        return this.f1224i;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f1219d == null) {
            this.f1219d = (ExpandedMenuView) this.f1217b.inflate(j.g.f13439g, viewGroup, false);
            if (this.f1224i == null) {
                this.f1224i = new a();
            }
            this.f1219d.setAdapter((ListAdapter) this.f1224i);
            this.f1219d.setOnItemClickListener(this);
        }
        return this.f1219d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        j.a aVar = this.f1223h;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        a aVar = this.f1224i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f1223h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f1221f
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1221f
            r0.<init>(r3, r1)
            r2.f1216a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f1217b = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f1216a
            if (r0 == 0) goto L23
            r2.f1216a = r3
            android.view.LayoutInflater r0 = r2.f1217b
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f1218c = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f1224i
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.i(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f1223h;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1218c.M(this.f1224i.getItem(i10), this, 0);
    }
}
