package cn.studyjamscn.s1.sj120.r3lish.networks;

import android.support.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import cn.studyjamscn.s1.sj120.r3lish.base.BaseJsonRequest;
import cn.studyjamscn.s1.sj120.r3lish.entity.UserEntity;

/**
 * Created by r3lis on 2016/4/4.
 */
public class DeleteOrderRequest extends BaseJsonRequest<Void> {

    String id;

    public DeleteOrderRequest(String id) {
        this.id = id;
    }

    @NonNull
    @Override
    protected JSONObject json() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("uid", UserEntity.getUid());
        json.put("id",id);
        return json;
    }

    @NonNull
    @Override
    protected String methodName() {
        return "index.php/Order/OrderDelete";
    }

    @Override
    protected Void parseResponse(@NonNull JSONObject response) throws JSONException {
        return null;
    }
}
