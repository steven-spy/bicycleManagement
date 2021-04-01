const preventBrowserCalls = function (req, res, proxyOptions) {
  if (req.headers.accept && req.headers.accept.indexOf('html') !== -1) {
    return '/index.html';
  }
  req.headers['X-Custom-Header'] = 'yes';
};

const PROXY_CONFIG = [
  {
    context: [
      '/User',
      '/BicycleTrack',
      '/Bicycle',
      '/LeasePoint'
    ],
    target: 'http://localhost:8090',
    secure: false,
    bypass: preventBrowserCalls,
    changeOrigin: true
  },
];
module.exports = PROXY_CONFIG;
