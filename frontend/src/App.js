import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  return (
      <Router>
        <Route exact path="/" component={AddEmployee} />
        <Route exact path="/view" component={Table} />
      </Router>
  );
}

export default App;
