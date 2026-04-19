package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k.e f888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f899m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f907u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f911y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f912z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f900n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f914b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.j.f13485c2);
            this.f914b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.j.f13490d2, -1);
            this.f913a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.j.f13495e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f913a, getPaddingRight(), z11 ? getPaddingBottom() : this.f914b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f901o || (message2 = alertController.f903q) == null) && (view != alertController.f905s || (message2 = alertController.f907u) == null)) ? (view != alertController.f909w || (message = alertController.f911y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f888b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f917b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f919d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f923h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f924i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f925j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f926k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f927l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f928m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f929n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f930o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f931p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f932q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f934s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f935t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f936u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f937v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f938w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f939x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f940y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f941z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f918c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f920e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f933r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f942a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f942a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f942a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0024b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f944a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f945b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f946c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f947d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0024b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f946c = recycleListView;
                this.f947d = alertController;
                Cursor cursor2 = getCursor();
                this.f944a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f945b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f944a));
                this.f946c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f945b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f917b.inflate(this.f947d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f949a;

            c(AlertController alertController) {
                this.f949a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f939x.onClick(this.f949a.f888b, i10);
                if (b.this.H) {
                    return;
                }
                this.f949a.f888b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f952b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f951a = recycleListView;
                this.f952b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f951a.isItemChecked(i10);
                }
                b.this.J.onClick(this.f952b.f888b, i10, this.f951a.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public b(Context context) {
            this.f916a = context;
            this.f917b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f917b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f916a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f937v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f916a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f916a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f938w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f916a
                java.lang.CharSequence[] r3 = r10.f937v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$b$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f939x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f893g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f922g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f921f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f919d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f918c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f920e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f923h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f924i;
            if (charSequence3 != null || this.f925j != null) {
                alertController.j(-1, charSequence3, this.f926k, null, this.f925j);
            }
            CharSequence charSequence4 = this.f927l;
            if (charSequence4 != null || this.f928m != null) {
                alertController.j(-2, charSequence4, this.f929n, null, this.f928m);
            }
            CharSequence charSequence5 = this.f930o;
            if (charSequence5 != null || this.f931p != null) {
                alertController.j(-3, charSequence5, this.f932q, null, this.f931p);
            }
            if (this.f937v != null || this.K != null || this.f938w != null) {
                b(alertController);
            }
            View view2 = this.f941z;
            if (view2 != null) {
                if (this.E) {
                    alertController.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i12 = this.f940y;
            if (i12 != 0) {
                alertController.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f954a;

        public c(DialogInterface dialogInterface) {
            this.f954a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f954a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, k.e eVar, Window window) {
        this.f887a = context;
        this.f888b = eVar;
        this.f889c = window;
        this.R = new c(eVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.j.F, j.a.f13344n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.j.M, true);
        this.f890d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        eVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f889c.findViewById(j.f.f13428v);
        View viewFindViewById2 = this.f889c.findViewById(j.f.f13427u);
        androidx.core.view.h.k0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f901o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f902p) && this.f904r == null) {
            this.f901o.setVisibility(8);
            i10 = 0;
        } else {
            this.f901o.setText(this.f902p);
            Drawable drawable = this.f904r;
            if (drawable != null) {
                int i11 = this.f890d;
                drawable.setBounds(0, 0, i11, i11);
                this.f901o.setCompoundDrawables(this.f904r, null, null, null);
            }
            this.f901o.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f905s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f906t) && this.f908v == null) {
            this.f905s.setVisibility(8);
        } else {
            this.f905s.setText(this.f906t);
            Drawable drawable2 = this.f908v;
            if (drawable2 != null) {
                int i12 = this.f890d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f905s.setCompoundDrawables(this.f908v, null, null, null);
            }
            this.f905s.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f909w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f910x) && this.f912z == null) {
            this.f909w.setVisibility(8);
        } else {
            this.f909w.setText(this.f910x);
            Drawable drawable3 = this.f912z;
            if (drawable3 != null) {
                int i13 = this.f890d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f909w.setCompoundDrawables(this.f912z, null, null, null);
            }
            this.f909w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f887a)) {
            if (i10 == 1) {
                button = this.f901o;
            } else if (i10 == 2) {
                button = this.f905s;
            } else if (i10 == 4) {
                button = this.f909w;
            }
            b(button);
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f889c.findViewById(j.f.f13429w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f892f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f893g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f893g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f894h;
        if (viewInflate == null) {
            viewInflate = this.f895i != 0 ? LayoutInflater.from(this.f887a).inflate(this.f895i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f889c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f889c.findViewById(j.f.f13420n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f900n) {
            frameLayout.setPadding(this.f896j, this.f897k, this.f898l, this.f899m);
        }
        if (this.f893g != null) {
            ((LinearLayout.LayoutParams) ((f0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        View viewFindViewById;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewFindViewById = this.f889c.findViewById(j.f.O);
        } else {
            this.D = (ImageView) this.f889c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f891e)) && this.P) {
                TextView textView = (TextView) this.f889c.findViewById(j.f.f13416j);
                this.E = textView;
                textView.setText(this.f891e);
                int i10 = this.B;
                if (i10 != 0) {
                    this.D.setImageResource(i10);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f889c.findViewById(j.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewFindViewById = viewGroup;
        }
        viewFindViewById.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f889c.findViewById(j.f.f13426t);
        int i10 = j.f.P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = j.f.f13419m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = j.f.f13417k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(j.f.f13421o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(j.f.K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f892f == null && this.f893g == null) ? null : viewGroupH.findViewById(j.f.N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(j.f.L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f893g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f893g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f893g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(j.a.f13343m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f887a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f893g;
    }

    public void e() {
        this.f888b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f910x = charSequence;
            this.f911y = message;
            this.f912z = drawable;
        } else if (i10 == -2) {
            this.f906t = charSequence;
            this.f907u = message;
            this.f908v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f902p = charSequence;
            this.f903q = message;
            this.f904r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f892f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f891e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f894h = null;
        this.f895i = i10;
        this.f900n = false;
    }

    public void r(View view) {
        this.f894h = view;
        this.f895i = 0;
        this.f900n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f894h = view;
        this.f895i = 0;
        this.f900n = true;
        this.f896j = i10;
        this.f897k = i11;
        this.f898l = i12;
        this.f899m = i13;
    }
}
