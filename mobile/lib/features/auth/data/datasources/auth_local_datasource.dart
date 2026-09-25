abstract class AuthLocalDataSource {
  Future<void> cacheToken(String token);
  Future<String?> getToken();
}

class AuthLocalDataSourceImpl implements AuthLocalDataSource {
  @override
  Future<void> cacheToken(String token) async {}

  @override
  Future<String?> getToken() async => null;
}
