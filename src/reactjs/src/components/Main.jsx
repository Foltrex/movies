import React from 'react';

import {Routes, Route} from 'react-router-dom';

import Home from './Home';
import Films from './films/Films';
import NoPage from './NoPage';
import SeriesPage from './series/SeriesPage';
import Cartoons from './cartoons/Cartoons';
import Characters from './characters/Characters';

const Main = () => {
    return (
        <div>
          <Routes>
            <Route exact path='/' element={<Home />} />
            <Route path='/series' element={<SeriesPage />} />
            <Route path='/films' element={<Films />} />
            <Route path='/cartoons' element={<Cartoons />} />
            <Route path='/characters' element={<Characters /> } />
            <Route path='*' element={<NoPage />} />
          </Routes>
        </div>
    );
}

export default Main;
