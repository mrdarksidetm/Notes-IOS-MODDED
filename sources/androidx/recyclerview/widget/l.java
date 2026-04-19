package androidx.recyclerview.widget;

import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f4884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f4885b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4886a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4890e;

        a() {
        }

        void a(int i10) {
            this.f4886a = i10 | this.f4886a;
        }

        boolean b() {
            int i10 = this.f4886a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f4889d, this.f4887b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f4886a;
            if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0 && (i11 & (c(this.f4889d, this.f4888c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f4886a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f4890e, this.f4887b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f4886a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f4890e, this.f4888c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f4886a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f4887b = i10;
            this.f4888c = i11;
            this.f4889d = i12;
            this.f4890e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    l(b bVar) {
        this.f4884a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f4884a.c();
        int iD = this.f4884a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f4884a.a(i10);
            this.f4885b.e(iC, iD, this.f4884a.b(viewA), this.f4884a.e(viewA));
            if (i12 != 0) {
                this.f4885b.d();
                this.f4885b.a(i12);
                if (this.f4885b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f4885b.d();
                this.f4885b.a(i13);
                if (this.f4885b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }
}
