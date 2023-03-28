import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-mi_video__comercial__item';

@customElement('vista-mi_video__comercial_')
export class VistaMi_video__comercial_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="width: 100%; height: 50%; align-items: center; justify-content: space-around;">
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="height: 50%; width: 100%; align-items: center; justify-content: space-around;">
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; align-items: center; justify-content: space-around;">
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
   <vista-mi_video__comercial__item></vista-mi_video__comercial__item>
  </vaadin-horizontal-layout>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
