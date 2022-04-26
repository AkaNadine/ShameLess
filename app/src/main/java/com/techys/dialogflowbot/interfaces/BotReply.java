package com.techys.dialogflowbot.interfaces;

import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.protobuf.InvalidProtocolBufferException;

public interface BotReply {

<<<<<<< HEAD
  void callback(DetectIntentResponse returnResponse) throws InvalidProtocolBufferException;
=======
    void callback(DetectIntentResponse returnResponse) throws InvalidProtocolBufferException;
>>>>>>> main
}
