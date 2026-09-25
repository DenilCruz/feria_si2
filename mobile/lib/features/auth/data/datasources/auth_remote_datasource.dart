import '../models/login_request_model.dart';
import '../models/token_model.dart';

abstract class AuthRemoteDataSource {
  Future<TokenModel> login(LoginRequestModel request);
}

class AuthRemoteDataSourceImpl implements AuthRemoteDataSource {
  @override
  Future<TokenModel> login(LoginRequestModel request) async {
    return const TokenModel(accessToken: 'dummy_token', refreshToken: 'dummy_refresh');
  }
}
