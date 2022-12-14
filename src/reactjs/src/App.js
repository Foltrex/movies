import logo from './logo.svg';
import './App.css';

import Footer from './components/Footer';
import Main from './components/Main';
import Navbar from './components/Navbar';

function App() {
  return (
    <div className="App">
      <Navbar />  
      <div className='content'>
        <Main />
      </div>
      <Footer /> 
    </div>
  );
}

export default App;
