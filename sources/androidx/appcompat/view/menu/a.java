package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f1171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f1173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f1174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f1175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f1176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f1179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1180j;

    public a(Context context, int i10, int i11) {
        this.f1171a = context;
        this.f1174d = LayoutInflater.from(context);
        this.f1177g = i10;
        this.f1178h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1179i).addView(view, i10);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        j.a aVar = this.f1176f;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1179i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f1173c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f1173c.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = arrayListE.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
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
        this.f1176f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f1172b = context;
        this.f1175e = LayoutInflater.from(context);
        this.f1173c = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f1174d.inflate(this.f1178h, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f1176f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f1173c;
        }
        return aVar.d(eVar);
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f1176f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarJ = view instanceof k.a ? (k.a) view : j(viewGroup);
        b(gVar, aVarJ);
        return (View) aVarJ;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f1179i == null) {
            k kVar = (k) this.f1174d.inflate(this.f1177g, viewGroup, false);
            this.f1179i = kVar;
            kVar.b(this.f1173c);
            d(true);
        }
        return this.f1179i;
    }

    public void p(int i10) {
        this.f1180j = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
