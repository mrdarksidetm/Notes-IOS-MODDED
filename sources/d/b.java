package d;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f9125l = "android$support$customtabs$ICustomTabsService".replace('$', com.amazon.a.a.o.c.a.b.f7490a);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: d.b$a$a, reason: collision with other inner class name */
        private static class C0214a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9126a;

            C0214a(IBinder iBinder) {
                this.f9126a = iBinder;
            }

            @Override // d.b
            public boolean H(d.a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    C0215b.d(parcelObtain, uri, 0);
                    C0215b.d(parcelObtain, bundle, 0);
                    C0215b.c(parcelObtain, list, 0);
                    this.f9126a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean J(d.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean L(d.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    C0215b.d(parcelObtain, uri, 0);
                    this.f9126a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean S(d.a aVar, int i10, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    C0215b.d(parcelObtain, uri, 0);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean T(d.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9126a;
            }

            @Override // d.b
            public boolean l(d.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f9126a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean p(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeLong(j10);
                    this.f9126a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public int q(d.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean r(d.a aVar, IBinder iBinder, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeStrongBinder(iBinder);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean u(d.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public boolean v(d.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9125l);
                    parcelObtain.writeStrongInterface(aVar);
                    C0215b.d(parcelObtain, uri, 0);
                    C0215b.d(parcelObtain, bundle, 0);
                    this.f9126a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f9125l);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0214a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    public static class C0215b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    boolean H(d.a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean J(d.a aVar, Bundle bundle);

    boolean L(d.a aVar, Uri uri);

    boolean S(d.a aVar, int i10, Uri uri, Bundle bundle);

    boolean T(d.a aVar, Bundle bundle);

    boolean l(d.a aVar);

    boolean p(long j10);

    int q(d.a aVar, String str, Bundle bundle);

    boolean r(d.a aVar, IBinder iBinder, Bundle bundle);

    boolean u(d.a aVar, Bundle bundle);

    boolean v(d.a aVar, Uri uri, Bundle bundle);
}
