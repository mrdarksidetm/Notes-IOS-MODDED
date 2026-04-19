package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements i3.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f1234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f1237e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f1246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f1247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1248p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f1256x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1258z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1244l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1249q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1250r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1251s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1252t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1253u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f1254v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f1255w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1257y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<g> f1238f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f1239g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1240h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g> f1241i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<g> f1242j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1243k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f1233a = context;
        this.f1234b = context.getResources();
        c0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1238f.size()) {
            return;
        }
        this.f1238f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f1248p = view;
            this.f1246n = null;
            this.f1247o = null;
        } else {
            if (i10 > 0) {
                this.f1246n = resourcesC.getText(i10);
            } else if (charSequence != null) {
                this.f1246n = charSequence;
            }
            if (i11 > 0) {
                this.f1247o = androidx.core.content.a.getDrawable(u(), i11);
            } else if (drawable != null) {
                this.f1247o = drawable;
            }
            this.f1248p = null;
        }
        K(false);
    }

    private void c0(boolean z10) {
        this.f1236d = z10 && this.f1234b.getConfiguration().keyboard != 1 && androidx.core.view.i.l(ViewConfiguration.get(this.f1233a), this.f1233a);
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f1255w.isEmpty()) {
            return;
        }
        e0();
        for (WeakReference<j> weakReference : this.f1255w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f1255w.remove(weakReference);
            } else {
                jVar.d(z10);
            }
        }
        d0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f1255w.isEmpty()) {
            return false;
        }
        boolean zK = jVar != null ? jVar.k(mVar) : false;
        for (WeakReference<j> weakReference : this.f1255w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.f1255w.remove(weakReference);
            } else if (!zK) {
                zK = jVar2.k(mVar);
            }
        }
        return zK;
    }

    private static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f1252t;
    }

    Resources C() {
        return this.f1234b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f1240h) {
            return this.f1239g;
        }
        this.f1239g.clear();
        int size = this.f1238f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f1238f.get(i10);
            if (gVar.isVisible()) {
                this.f1239g.add(gVar);
            }
        }
        this.f1240h = false;
        this.f1243k = true;
        return this.f1239g;
    }

    public boolean F() {
        return this.f1257y;
    }

    boolean G() {
        return this.f1235c;
    }

    public boolean H() {
        return this.f1236d;
    }

    void I(g gVar) {
        this.f1243k = true;
        K(true);
    }

    void J(g gVar) {
        this.f1240h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (this.f1249q) {
            this.f1250r = true;
            if (z10) {
                this.f1251s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f1240h = true;
            this.f1243k = true;
        }
        i(z10);
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
  0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            o3.a r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.m) r7
            if (r4 == 0) goto L63
            r2.f(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.M(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public void O(j jVar) {
        for (WeakReference<j> weakReference : this.f1255w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1255w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f1237e = aVar;
    }

    public e S(int i10) {
        this.f1244l = i10;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1238f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f1238f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    protected e U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    protected e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected e X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    protected e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iB = B(i12);
        g gVarG = g(i10, i11, i12, iB, charSequence, this.f1244l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1245m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f1238f;
        arrayList.add(n(arrayList, iB), gVarG);
        K(true);
        return gVarG;
    }

    public void a0(boolean z10) {
        this.f1252t = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f1234b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f1234b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1233a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1234b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1234b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f1233a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f1233a);
    }

    public void b0(boolean z10) {
        this.f1258z = z10;
    }

    public void c(j jVar, Context context) {
        this.f1255w.add(new WeakReference<>(jVar));
        jVar.i(context, this);
        this.f1243k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f1256x;
        if (gVar != null) {
            f(gVar);
        }
        this.f1238f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f1247o = null;
        this.f1246n = null;
        this.f1248p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1237e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f1249q = false;
        if (this.f1250r) {
            this.f1250r = false;
            K(this.f1251s);
        }
    }

    public final void e(boolean z10) {
        if (this.f1253u) {
            return;
        }
        this.f1253u = true;
        for (WeakReference<j> weakReference : this.f1255w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f1255w.remove(weakReference);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f1253u = false;
    }

    public void e0() {
        if (this.f1249q) {
            return;
        }
        this.f1249q = true;
        this.f1250r = false;
        this.f1251s = false;
    }

    public boolean f(g gVar) {
        boolean zF = false;
        if (!this.f1255w.isEmpty() && this.f1256x == gVar) {
            e0();
            for (WeakReference<j> weakReference : this.f1255w) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zF = jVar.f(this, gVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.f1255w.remove(weakReference);
                }
            }
            d0();
            if (zF) {
                this.f1256x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1238f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f1238f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f1237e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1258z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1238f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zG = false;
        if (this.f1255w.isEmpty()) {
            return false;
        }
        e0();
        for (WeakReference<j> weakReference : this.f1255w) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zG = jVar.g(this, gVar);
                if (zG) {
                    break;
                }
            } else {
                this.f1255w.remove(weakReference);
            }
        }
        d0();
        if (zG) {
            this.f1256x = gVar;
        }
        return zG;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f1238f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1238f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f1254v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarP = p(i10, keyEvent);
        boolean zL = gVarP != null ? L(gVarP, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1238f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f1238f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> arrayListE = E();
        if (this.f1243k) {
            boolean zE = false;
            for (WeakReference<j> weakReference : this.f1255w) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.f1255w.remove(weakReference);
                } else {
                    zE |= jVar.e();
                }
            }
            if (zE) {
                this.f1241i.clear();
                this.f1242j.clear();
                int size = arrayListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = arrayListE.get(i10);
                    (gVar.l() ? this.f1241i : this.f1242j).add(gVar);
                }
            } else {
                this.f1241i.clear();
                this.f1242j.clear();
                this.f1242j.addAll(E());
            }
            this.f1243k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iL = l(i10);
        if (iL >= 0) {
            int size = this.f1238f.size() - iL;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f1238f.get(iL).getGroupId() != i10) {
                    break;
                }
                N(iL, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f1241i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1238f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1238f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1257y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1238f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1238f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1238f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1238f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1235c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1238f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f1233a;
    }

    public g v() {
        return this.f1256x;
    }

    public Drawable w() {
        return this.f1247o;
    }

    public CharSequence x() {
        return this.f1246n;
    }

    public View y() {
        return this.f1248p;
    }

    public ArrayList<g> z() {
        r();
        return this.f1242j;
    }
}
