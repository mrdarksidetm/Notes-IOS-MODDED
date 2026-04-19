package o4;

import android.app.Application;
import androidx.lifecycle.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import nd.t;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Class<?>> f16355a = u.p(Application.class, androidx.lifecycle.q.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Class<?>> f16356b = t.d(androidx.lifecycle.q.class);

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        ae.r.f(cls, "modelClass");
        ae.r.f(list, "signature");
        Object[] constructors = cls.getConstructors();
        ae.r.e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            ae.r.e(parameterTypes, "constructor.parameterTypes");
            List listE0 = nd.p.E0(parameterTypes);
            if (ae.r.b(list, listE0)) {
                ae.r.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listE0.size() && listE0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends w> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        ae.r.f(cls, "modelClass");
        ae.r.f(constructor, "constructor");
        ae.r.f(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
