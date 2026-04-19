package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;

/* JADX INFO: loaded from: classes.dex */
public class w extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1888i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f1891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f1892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f1894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f1896h;

    class a extends e0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f1897j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1897j = hVar;
        }

        @Override // androidx.appcompat.widget.e0
        public q.e b() {
            return this.f1897j;
        }

        @Override // androidx.appcompat.widget.e0
        public boolean c() {
            if (w.this.getInternalPopup().a()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().a()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (n3.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class f implements j, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.b f1900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f1902c;

        f() {
        }

        @Override // androidx.appcompat.widget.w.j
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f1900a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.j
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1900a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1900a = null;
            }
        }

        @Override // androidx.appcompat.widget.w.j
        public void e(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.j
        public int f() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.j
        public void g(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.j
        public CharSequence h() {
            return this.f1902c;
        }

        @Override // androidx.appcompat.widget.w.j
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.j
        public void k(CharSequence charSequence) {
            this.f1902c = charSequence;
        }

        @Override // androidx.appcompat.widget.w.j
        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.j
        public void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.j
        public void n(int i10, int i11) {
            if (this.f1901b == null) {
                return;
            }
            b.a aVar = new b.a(w.this.getPopupContext());
            CharSequence charSequence = this.f1902c;
            if (charSequence != null) {
                aVar.n(charSequence);
            }
            androidx.appcompat.app.b bVarA = aVar.m(this.f1901b, w.this.getSelectedItemPosition(), this).a();
            this.f1900a = bVarA;
            ListView listViewI = bVarA.i();
            d.d(listViewI, i10);
            d.c(listViewI, i11);
            this.f1900a.show();
        }

        @Override // androidx.appcompat.widget.w.j
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            w.this.setSelection(i10);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i10, this.f1901b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.w.j
        public void p(ListAdapter listAdapter) {
            this.f1901b = listAdapter;
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f1904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1905b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1904a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1905b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof r.u) {
                    r.u uVar = (r.u) spinnerAdapter;
                    if (uVar.getDropDownViewTheme() == null) {
                        uVar.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1905b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1905b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1904a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends g0 implements j {
        private CharSequence I;
        ListAdapter X;
        private final Rect Y;
        private int Z;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f1907a;

            a(w wVar) {
                this.f1907a = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                w.this.setSelection(i10);
                if (w.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    w.this.performItemClick(view, i10, hVar.X.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.Q(w.this)) {
                    h.this.dismiss();
                } else {
                    h.this.O();
                    h.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1910a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1910a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1910a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.Y = new Rect();
            z(w.this);
            F(true);
            K(0);
            H(new a(w.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.i()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.w.this
                android.graphics.Rect r1 = r1.f1896h
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                boolean r0 = androidx.appcompat.widget.z0.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.f1896h
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.f1896h
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.f1896h
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                int r5 = r4.f1895g
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.X
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.i()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.w.this
                android.graphics.Rect r6 = r6.f1896h
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.B(r4)
                goto L85
            L82:
                r8.B(r5)
            L85:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                boolean r4 = androidx.appcompat.widget.z0.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.v()
                int r3 = r3 - r0
                int r0 = r8.P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.g(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.h.O():void");
        }

        public int P() {
            return this.Z;
        }

        boolean Q(View view) {
            return androidx.core.view.h.G(view) && view.getGlobalVisibleRect(this.Y);
        }

        @Override // androidx.appcompat.widget.w.j
        public CharSequence h() {
            return this.I;
        }

        @Override // androidx.appcompat.widget.w.j
        public void k(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.w.j
        public void m(int i10) {
            this.Z = i10;
        }

        @Override // androidx.appcompat.widget.w.j
        public void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            O();
            E(2);
            super.b();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            d.d(listViewJ, i10);
            d.c(listViewJ, i11);
            L(w.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // androidx.appcompat.widget.g0, androidx.appcompat.widget.w.j
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.X = listAdapter;
        }
    }

    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1912a;

        class a implements Parcelable.Creator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1912a = parcel.readByte() != 0;
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1912a ? (byte) 1 : (byte) 0);
        }
    }

    interface j {
        boolean a();

        void dismiss();

        void e(Drawable drawable);

        int f();

        void g(int i10);

        CharSequence h();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.J);
    }

    public w(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1896h);
        Rect rect = this.f1896h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f1894f.n(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1894f;
        return jVar != null ? jVar.f() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1894f;
        return jVar != null ? jVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1894f != null ? this.f1895g : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f1894f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1894f;
        return jVar != null ? jVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1890b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1894f;
        return jVar != null ? jVar.h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1894f;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.f1894f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1894f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1912a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1894f;
        iVar.f1912a = jVar != null && jVar.a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f1891c;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1894f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1893e) {
            this.f1892d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1894f != null) {
            Context context = this.f1890b;
            if (context == null) {
                context = getContext();
            }
            this.f1894f.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f1894f;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            jVar.m(i10);
            this.f1894f.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f1894f;
        if (jVar != null) {
            jVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1894f != null) {
            this.f1895g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1894f;
        if (jVar != null) {
            jVar.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(l.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1894f;
        if (jVar != null) {
            jVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1889a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
